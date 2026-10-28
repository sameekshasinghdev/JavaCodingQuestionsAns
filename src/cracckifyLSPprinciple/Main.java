package cracckifyLSPprinciple;

public class Main {

	public static void main(String[] args) {
		// LSP= Liskov Substitution Principle
		//A child class should be able to replace its parent without breaking 
		//its expected behavior or changing the meaning of parent method/obj
		//OR
		//child must honor parent contract
		
		//OR
		//all methods that are present in parent class should be valid for child class
		
		
//		ElectricCar car = new ElectricCar();
//		car.fly();
		Car car1 = new ElectricCar();
        Car car2 = new FuelPoweredCar();

        testCar(car1);
        testCar(car2);
	}

	private static void testCar(Car car) {
		car.drive();
        car.applyBrake();
        car.reverse();
        car.park();
        car.accelerate();
	}

}
interface Car{
	void drive();
	//void startEngine();//not all cars have engine we will have seperate interface
	void applyBrake();
	void reverse();
	void park();
	void accelerate();
	//void fillFuel();//
}

interface EngineCar {
	void startEngine();
	void fillFuel();
	
}

interface FlyableCar{
	void fly();
}

class ElectricCar implements Car,FlyableCar{

	@Override
	public void drive() {
		System.out.println("Electric car is driving");
		
	}

	@Override
	public void applyBrake() {
		System.out.println("Electric car is applying breaks");
		
	}

	@Override
	public void reverse() {
		System.out.println("Electric car is reversing");
		
	}

	@Override
	public void park() {
		System.out.println("Electric car is parking");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Electric car is acclerrating");
		
	}

	@Override
	public void fly() {
		System.out.println("Electric car is flying");
		
	}
	
}
class FuelPoweredCar implements Car,EngineCar{

	@Override
	public void drive() {
		 System.out.println("Petrol car is driving");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Petrol car engine is starting");
		
	}

	@Override
	public void applyBrake() {
		System.out.println("Petrol car is breaking");
		
	}

	@Override
	public void reverse() {
		System.out.println("Petrol car is taking reverse");
		
	}

	@Override
	public void park() {
		System.out.println("Petrol car is parking");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Petrol car is acclerating");
		
	}

	@Override
	public void fillFuel() {
		System.out.println("Fuiling in petrol car");
		
	}


	
}