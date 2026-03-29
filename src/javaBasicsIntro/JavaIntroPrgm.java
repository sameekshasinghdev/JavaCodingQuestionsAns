package javaBasicsIntro;

import java.util.Scanner;

public class JavaIntroPrgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1.Enter 3 numbers from the user & make a function to print their average.
		System.out.println("1.Enter 3 numbers from the user & make a function to print their average: ");
		System.out.println("Enter three numbers to get average: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		findAvgOfNum(a,b,c);
//		2. Write a function to print the sum of all odd numbers from 1 to n.

		System.out.println("2. Write a function to print the sum of all odd numbers from 1 to n. : ");
		sumOfOdd(10);
//		3. Write a function which takes in 2 numbers and returns the greater of those two.
		System.out.println("3. Write a function which takes in 2 numbers and returns the greater of those two. :");
		System.out.println("Enter two numbers to find greatest: ");
		System.out.println("first : ");
		int f1=sc.nextInt();
		System.out.println("second : ");
		int f2 = sc.nextInt();
		greatestOfTwo(f1,f2);
		
//		4. Write a function that takes in the radius as input and returns the circumference of a circle.
		System.out.println("4. Write a function that takes in the radius as input and returns the circumference of a circle: ");
		System.out.println("Enter radius of circle : ");
		int r = sc.nextInt();
		findCircumferenceOfCircle(r);
		
//		5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
		System.out.print("Enter your age: ");
		int age= sc.nextInt();
		elibleForVote(age);
		
//		6. Write an infinite loop using do while condition.
//		7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
		findKindOfNum();
		
//		8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
//		9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
//		10. Write a program to print Fibonacci series of n terms where n is input by user :
//		0 1 1 2 3 5 8 13 21 ..... 
//		 In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//		(BONUS)

	}

	private static void findKindOfNum() {
		Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter an integer: ");
            // Validate integer input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid input
                continue;
            }

            int number = scanner.nextInt();

            // Count based on value
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            // Ask user if they want to continue
            System.out.print("Do you want to enter another number? (y/n): ");
            String choice = scanner.next().trim().toLowerCase();

            if (!choice.equals("y")) {
                break; // Exit loop if user doesn't enter 'y'
            }
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        scanner.close();
		
	}

	private static void elibleForVote(int age) {
		if(age>18) {
			System.out.println("Congratulations😁🎉! You are egible for vote");
		}
		else {
			int after= 18-age;
			System.out.println("We are sorry🥺, You are not elible for vote...please come after "+ after+ " years. Thankyou!");
		}
	}

	private static void findCircumferenceOfCircle(int r) {
		
		
		double c= 2*(3.14)*r;
		System.out.println("Circumference of circle with radius "+r+" is : "+c);
		
	}

	private static void greatestOfTwo(int f1,int f2) {
		// TODO Auto-generated method stub
		
		int max = Math.max(f1, f2);
		System.out.println("greatest is :"+max);
		
	}

	private static void sumOfOdd(int n) {
		// TODO Auto-generated method stub
//		if(n==0) {
//			return -1;
//		}
		for(int i =1; i<=n;i++) {
			if((i%2)!=0) {
				System.out.println(i);
			}
		}
		//return 0;
	}

	private static void findAvgOfNum(int a,int b, int c) {
		int sum = a+b+c;
		int avg = sum/3;
		System.out.println("Average of "+ a+", "+ b+ " and "+c+" is : "+avg);
	}

}
