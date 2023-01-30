import java.util.Scanner;

class Menus {
    static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		String s;
		s = "";
		while (!s.equals("x")) {
			System.out.println("-----------------------");
			System.out.println("Here Are Your Choices");
			System.out.println("[B]eep");
			System.out.println("[F]avorite Number");
			System.out.println("[J]oke");
			System.out.println("E[x]it");
			System.out.println("-----------------------");
			s = userinput.next();
			s = s.toLowerCase();
			if (s.equals("b")) {
				System.out.println("I am a robot. Beep. Beep.");
			} else if (s.equals("f")) {
				System.out.println("My favorite number is " + Math.random() * 100);
			} else if (s.equals("j")) {
				System.out.println("Why did the chicken cross the road?");
				Thread.sleep(2000); // this can generate an exception
				System.out.println("To get to the other side");
			}

		} // end while loop
		System.out.println("Program Ending ...");
	} // end main line
} //end class

