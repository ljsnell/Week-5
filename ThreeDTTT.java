import java.util.Scanner;

class ThreeDTTT {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		int x, y, z;
		int size = 4;
		System.out.println("This produces a randomly filled 4x4x4 Tic Tac Toe Board");
		System.out.println(" L1   L2   L3   L4");
		for (y = 1; y <= size; y++) {
			for (z = 1; z <= size; z++) {
				for (x = 1; x <= size; x++) {
					int r;
					r = (int) (2.0 * Math.random());
					if (r == 0) {
						System.out.print("O");
					} else {
						System.out.print("X");
					}
				}
				System.out.print(" ");
			}
			System.out.println("");
		}

	} // end main line

} // end class
