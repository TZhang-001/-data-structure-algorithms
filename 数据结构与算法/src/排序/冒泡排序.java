package 排序;

import java.util.Arrays;

public class 冒泡排序 {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 2, 4, 6, 7, 1, 2 };
		int[] sorted = bubbleSort(array);
		String s = Arrays.toString(sorted);
		System.out.println(s);
	}

	// 这是自己写的冒泡排序，一遍过，无bug
	// flag是后加上去的，如果一遍排序里没有数字位置交换，则排序已经完成，可以提前退出
	public static int[] bubbleSort(int[] array) {
		int len = array.length;
		for (int i = len - 1; i > 0; i--) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				int a = array[j];
				int b = array[j + 1];
				array[j] = a < b ? a : b;
				array[j + 1] = a > b ? a : b;
				if (array[j] != a) {
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		return array;
	}

}
