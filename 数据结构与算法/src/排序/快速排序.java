package 排序;

import java.util.Arrays;

public class 快速排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// int[] test = {1, 1, 8, 8};
		// int[] test = {1, 3, 9, 2};
		// int[] test = {8, 8, 1, 1};
		// int[] test = {1, 2};
		// int[] test = {2, 1};
		// int[] test = {2};
		// int[] test = {};
		// int[] test = {2, 4, 6, 1, 3, 5};
		// int[] test = { 99, 88, 77, 1, 22, 3, 67, 234, 1 };
		// int[] test = { 99, 88, 77, 1, 55};
		int[] test = { 9, 8, 7, 6, 5 };
		quickSort(test, 0, test.length - 1);
		System.out.println(Arrays.toString(test));

	}

	public static void quickSort(int[] arr, int p, int q) {

		if (p < 0 || q - p <= 0) {
			return;
		}

		int m = partition(arr, p, q);
		quickSort(arr, p, m - 1);
		quickSort(arr, m + 1, q);

	}

	/*
	 * 这里的处理有点类似选择排序。 我们通过游标 i 把 A[p…r-1]分成两部分。 A[p…i-1]的元素都是小于 pivot
	 * 的，我们暂且叫它“已处理区间”，A[i…r-1]是“未处理区间”。 我们每次都从未处理的区间 A[i…r-1]中取一个元素 A[j]，与
	 * pivot 对比， 如果小于 pivot，则将其加入到已处理区间的尾部，也就是 A[i]的位置。 只需要将 A[i]与 A[j]交换，就可以在
	 * O(1) 时间复杂度内将 A[j]放到下标为 i 的位置。
	 * 
	 * 1. 选择一个pivot（通常是最末位） 2. 确定i的位置为头p 3. 利用loop，j = p一直到q，挨个与pivot大小对比：
	 * 如果current arr[j] 比 pivot小，交换 arr[j] 和 arr[i]，并且把i向后挪动一位 4. 交换 arr[j] 和
	 * pivot
	 * 
	 */
	private static int partition(int[] arr, int p, int q) {

		int pivot = arr[q];
		int i = p;

		for (int j = p; j < q; j++) {
			if (arr[j] < pivot) {
				swap(arr, i, j);
				i++;
			}
		}
		// 重点理解为什么swap(arr, i, q)，因为i位置上正好是可以换的
		swap(arr, i, q);

		return i;

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
