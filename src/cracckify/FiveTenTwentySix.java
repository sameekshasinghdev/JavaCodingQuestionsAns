package cracckify;

public class FiveTenTwentySix {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(findPeakElement(nums));
		
		int[] nums1 = {4,5,6,7,0,1,2};
		int target =0;
		System.out.println(search(nums1,target));

	}
	
	public static int findPeakElement(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = (right + left) / 2;

			if (nums[mid] > nums[mid + 1]) {
				right = mid;
			} else {
				left = mid + 1;
			}

		}
		return left;
	}
	
	
	public static int search(int[] nums1, int target) {

		int left = 0;
		int right = nums1.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;

			if (nums1[mid] == target) {
				return mid;
			}
			if (nums1[left] <= nums1[mid]) {
				if ((nums1[left] <= target) && (target < nums1[mid])) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			} else {
				if ((nums1[mid] < target) && (target <= nums1[right])) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}

}
