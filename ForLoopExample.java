import java.util.Scanner;

class ForLoopExample {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		// for (initialization, test for continuing, variable change)
		// incrementing for loop
		for (int i = 1; i <= 10; i++) {
			System.out.println("-->" + i);
			Thread.sleep(300);
		}

		// decrementing for loop
		for (int i = 10; i >= 0; i--) {
			System.out.println("-->" + i);
			Thread.sleep(300);
		}
		System.out.println("Blast off");

		// skip for loop
		int sum = 0;
		for (int i = 1; i <= 15; i += 2) {
			sum += i;
			System.out.println("-->" + sum);
			Thread.sleep(300);
		}
		System.out.println("Blast off");

		// for loop with random value for loop variable
		int[] numbers = { 3, 6, 7, 8, 34, 98, 45, 100 };
		for (int i : numbers) {
			System.out.println("-->" + i);
			Thread.sleep(300);
		}
	} // end main line
} // end class
