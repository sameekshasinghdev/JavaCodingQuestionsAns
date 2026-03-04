package InterPrac;

public class LogicProblemSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FizzBuzz
//		String s="";
//		System.out.println(fizzBuzz(s));
//		for(int i=1;i<=50;i++){
//		    if(i%15==0) System.out.println("FizzBuzz");
//		    else if(i%3==0) System.out.println("Fizz");
//		    else if(i%5==0) System.out.println("Buzz");
//		    else System.out.println(i);
//		}
		
		//Armstrong number
		int a =153;
		System.out.println("Is Amstrong : "+isAmstrong(a));
		

	}

	private static boolean isAmstrong(int a) {
		// TODO Auto-generated method stub
		int temp=a, sum =0;
		
		while(a>0) {
			int d = a%10;
			sum+=d*d*d;
			a=a/10;
			
		}
		return (temp==sum);
	}

}
