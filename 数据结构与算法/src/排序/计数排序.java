package 排序;

import java.util.Arrays;

public class 计数排序 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 1, 1, 1, 1, 1, 9, 0 };
		int[] a2 = { 26, 30, 25, 26, 30, 29, 29, 25, 27, 26 };

		countingSort(a);
		countingSort2(a2, 25, 30);
	}

	// 假设数组a里的数值范围是0-9
	public static void countingSort(int[] a) {
		int[] c = new int[10];
		int[] r = new int[a.length];
		for (int n : a) {
			c[n]++;
		}

		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = sum + c[i];
			sum = c[i];
		}

		for (int n : a) {
			int temp = c[n] - 1;
			r[temp] = n;
			c[n] = c[n] - 1;
		}
		System.out.println(Arrays.toString(r));
	}

	// 给定数组范围是从low到high的连续数字
	public static void countingSort2(int[] a, int low, int high) {
		int[] c = new int[high - low + 1];
		int[] r = new int[a.length];

		for (int n : a) {
			c[n - low]++;
		}

		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = sum + c[i];
			sum = c[i];
		}

		for (int n : a) {
			int temp = c[n - low] - 1;
			r[temp] = n;
			c[n - low] = c[n - low] - 1;
		}
		System.out.println(Arrays.toString(r));
	}

}
