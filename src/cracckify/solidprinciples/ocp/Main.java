package cracckifyOCPpriniciple;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//this is OCP Principle = Open Closed Principle(SOLID)
		//That is Open for extension but closed for modification
		//Remember OCP= Add new behavior through extension.
		//Related pattern = Strategy Design Pattern
		
		
//		DiscountStrategy discountStrategy;
//		discountStrategy = new GoldDiscountStrategy();
//		DiscountService discountservice = new DiscountService(discountStrategy);
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println(discountservice.getDiscount(s));
		
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter membership type: ");
	        String type = sc.nextLine();

	        DiscountStrategy discountStrategy;

	        switch (type.toUpperCase()) {

	            case "GOLD":
	                discountStrategy = new GoldDiscountStrategy();
	                break;

	            case "PLATINUM":
	                discountStrategy = new PlatinumDiscountStrategy();
	                break;

	            default:
	                throw new IllegalArgumentException(
	                        "Invalid membership type: " + type
	                );
	        }

	        DiscountService discountService =
	                new DiscountService(discountStrategy);

	        System.out.println(
	                discountService.getDiscount()
	        );

	        sc.close();
		
	}
}


class DiscountService{
	
	DiscountStrategy discountStrategy;
	
	//constructor
	public DiscountService(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double getDiscount() {
//		if(type=="GOLD") return 0.05;
//		if(type=="PLATINUM") return 0.15;
//		return 0.0;
		return discountStrategy.getDiscount();
	}
	
}

interface DiscountStrategy{
	public double getDiscount() ;
}

class PlatinumDiscountStrategy implements DiscountStrategy{

	@Override
	public double getDiscount() {
		return 0.15;
	}
	
}

class GoldDiscountStrategy implements DiscountStrategy{

	@Override
	public double getDiscount() {
		return 0.05;
	}
	
}
