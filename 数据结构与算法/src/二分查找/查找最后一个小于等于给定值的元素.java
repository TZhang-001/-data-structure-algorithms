package 二分查找;

public class 查找最后一个小于等于给定值的元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sorted = { 25, 25, 25, 25, 29, 33, 39, 44, 900 };
		int index = binarySearch(sorted, 25);
		System.out.println(index);

	}

	public static int binarySearch(int[] sorted, int target) {
		int low = 0;
		int high = sorted.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sorted[mid] > target) {
				high = mid - 1;
			} else {
				if (sorted[mid] <= target && (mid == sorted.length - 1 || sorted[mid + 1] > target)) {
					return mid;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}

}
