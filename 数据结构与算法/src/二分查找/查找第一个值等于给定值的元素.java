package 二分查找;

public class 查找第一个值等于给定值的元素 {

	public static void main(String[] args) {
		int[] sorted = { 25, 25, 25, 25, 29, 33, 39, 44, 900 };
		int index = binarySearch(sorted, 29);
		System.out.println(index);

	}

	public static int binarySearch(int[] sorted, int target) {
		int low = 0;
		int high = sorted.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sorted[mid] < target) {
				low = mid + 1;
			} else {
				if (sorted[mid] == target && (mid == 0 || sorted[mid - 1] < target)) {
					return mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
