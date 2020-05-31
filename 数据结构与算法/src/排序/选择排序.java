package 排序;

import java.util.Arrays;

public class 选择排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 9, 8, 17, 96, 5, 3, 2, 5, 1 };
		int[] sorted = selectionSort(array);
		String s = Arrays.toString(sorted);
		System.out.println(s);

	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int tmp = arr[min];
				arr[min] = arr[i];
				arr[i] = tmp;
			}
		}
		return arr;
	}

}
