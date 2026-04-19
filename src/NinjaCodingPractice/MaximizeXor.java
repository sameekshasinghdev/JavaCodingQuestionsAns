package NinjaCodingPractice;

public class MaximizeXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxXor(8,20));

	}
	 public static int maxXor(int L, int R) {
	        
	        int k =2;
	        int winSum = 0;
	        int j=0;
	        int[] arr = new int[R-L+1];
	        for(int i=L;i<=R;i++){
	            arr[j]=i;
	            j++;
	        }
	        for(int i=0;i<k;i++){
	            winSum = winSum+arr[i];
	        }
	        int maxSum = winSum;

	        for(int i = k; i<arr.length;i++){
	            winSum = winSum+arr[i];
	            winSum = winSum -arr[i-k];
	            maxSum=Math.max(maxSum,winSum);
	        }
	        return maxSum;
	    }
}
