package 排序;

import java.util.Arrays;

public class 归并排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] test = {1, 1, 8, 8};
		// int[] test = {1, 3, 9, 2};
		// int[] test = {8, 8, 1, 1};
		// int[] test = {1, 2};
		// int[] test = {2, 1};
		// int[] test = {2};
		// int[] test = {};
		// int[] test = {2, 4, 6, 1, 3, 5};
		int[] test = { 99, 88, 77, 1, 22, 3, 67, 234, 1 };
		String s = Arrays.toString(sort(test, 0, test.length - 1));
		System.out.println(s);
	}

	public static int[] sort(int[] a, int p, int q) {

		if (a.length <= 1) {
			return a;
		}

		int len = p - q;
		if (len == 0) {
			int[] num = { a[p] };
			return num;
		}
		int m = (p + q) / 2;
		int[] l = sort(a, p, m);
		int[] r = sort(a, m + 1, q);
		return merge(l, r);
	}

	/*
	 * merge的主要步骤： 1. 把a1, a2两个复制到新的ca1， ca2里 2. 在ca1， ca2尾部设置哨兵 3.
	 * 创建新的数组，作为返回值res 4. 利用loop把a1, a2的数字逐一安排到新的返回值res里
	 */

	public static int[] merge(int[] a1, int[] a2) {

		int len1 = a1.length;
		int len2 = a2.length;
		int[] ca1 = new int[len1 + 1];
		int[] ca2 = new int[len2 + 1];

		System.arraycopy(a1, 0, ca1, 0, len1);
		System.arraycopy(a2, 0, ca2, 0, len2);

		// Integer.MAX_VALUE相当于一个哨兵
		ca1[len1] = Integer.MAX_VALUE;
		ca2[len2] = Integer.MAX_VALUE;

		int[] res = new int[len1 + len2];
		int reslen = len1 + len2;
		int p1 = 0;
		int p2 = 0;
		for (int i = 0; i < reslen; i++) {
			res[i] = ca1[p1] < ca2[p2] ? a1[p1] : a2[p2];

			if (ca1[p1] < ca2[p2]) {
				p1++;
			} else {
				p2++;
			}
		}
		return res;
	}

}
