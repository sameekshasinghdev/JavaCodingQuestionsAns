package cracckify;

public class SevenTeenTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		int days=5;
		System.out.println(shipWithinDays(weights,days));

	}
	
	public static int shipWithinDays(int[] weights, int days) {
		int left = 0, right = 0;

		for (int i : weights) {
			left = Math.max(left, i);
			right += i;

		}

		while (left < right) {
			int mid = (right + left) / 2;

			if (canBeShiped(weights, days, mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}

		}
		return left;

	}

	public static boolean canBeShiped(int[] weights, int days, int cap) {
		int currentLoad = 0;
		int noDaysReq = 1;

		for (int w : weights) {
			if (currentLoad + w > cap) {
				noDaysReq++;
				currentLoad = 0;
			}
			currentLoad += w;

			if (noDaysReq > days) {
				return false;
			}
		}
		return true;
	}

}
