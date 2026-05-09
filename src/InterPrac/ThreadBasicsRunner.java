package InterPrac;

class Task1 extends Thread {

	@Override
	public void run() {
		System.out.println("\nTask1 Started");

		for (int i = 101; i < 199; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask1 Done");
	}

}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask2 Started");

		for (int i = 201; i < 299; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask2 Done");
	}

}

class Task3 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask3 Started");
		
		for(int i=301;i<399;i++) {
			System.out.println(i+ " ");
		}
		System.out.println("\nTask3 Done");
	}
}