package 排序;

import java.util.Arrays;

public class 插入排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 9, 8, 7, 6, 5, 3, 2, 5, 1 };
		int[] sorted = insertionSort(array);
		String s = Arrays.toString(sorted);
		System.out.println(s);

	}

	public static int[] insertionSort(int[] a) {
		int len = a.length;
		for (int i = 1; i < len; i++) {
			int current = a[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (a[j] > current) {
					a[j + 1] = a[j];
				} else {
					break;
				}
			}
			a[j + 1] = current;
		}
		return a;
	}

}
