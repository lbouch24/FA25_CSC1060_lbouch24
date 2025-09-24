import java.util.Scanner;
public class BottlesOfBeer {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, t;
		System.out.print("How many bottles of Beer?");
		n = in.nextInt();
		t = n;
		while (3 <= n && n <= 99) {
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", n, n);
			n--;
			System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n", n);
		} while (n == 2) {
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", n, n);
			n--;
			System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.\n", n);
		} while (n == 1) {
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
			System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
			n--;
		}
		if (n == 0) {
			System.out.printf("0 bottles of beer on the wall, 0 bottles of beer.\n Go to the store and buy some more, %d bottles of beer on the wall.", t);
		}
		in.close();
	}
}
