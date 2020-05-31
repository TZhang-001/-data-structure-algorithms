package 二分查找;

public class 二分查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] sorted = {0, 1, 2, 3, 4, 5, 9};
		int[] sorted = { 25, 29, 33, 39, 44, 900 };
		int index = binarySearch(sorted, 9001);
		System.out.println(index);

	}
	/*
	 * 虽然大部分情况下，用二分查找可以解决的问题，用散列表、二叉树都可以解决。
	 * 但是，我们后面会讲，不管是散列表还是二叉树，都会需要比较多的额外的内存空间。 如果用散列表或者二叉树来存储这 1000 万的数据，用 100MB
	 * 的内存肯定是存不下的。 而二分查找底层依赖的是数组，除了数据本身之外，不需要额外存储其他信息，是最省内存空间的存储方式，
	 * 所以刚好能在限定的内存大小下解决这个问题
	 */

	// 基础版本的二分查找：sorted的数组里不含有重复元素
	public static int binarySearch(int[] sorted, int target) {
		int low = 0;
		int high = sorted.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sorted[mid] == target) {
				return mid;
			} else {
				if (sorted[mid] > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}

}
