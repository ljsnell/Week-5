import java.util.Scanner;

class WhileExample {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		int n;
		System.out.println("This program creates a sequence.");
		System.out.print("Enter a Whole Number-->");
		n = userinput.nextInt();
		System.out.print("The sequence is: ");
		while ((n > 0) && (n < 1000000000)) {
			System.out.print(n + ", ");

			Thread.sleep(200);
			n = 2 * n + 1;
		} // end while loop
		System.out.println("...");
		System.out.println("The program is ended ...");

	} // end main line
} // end class
