import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean runAgain = true;
        while (runAgain) {
            int n;
            char symbol;
            System.out.print("Size? ");
            n = in.nextInt();
            while (n <= 0 || n > 50) {
                System.out.print("Enter new size (1-50): ");
                n = in.nextInt();
            }
            System.out.print("Symbol? ");
            symbol = in.next().charAt(0);           
            for (int x = 1; x <= n; x++) {
                for (int y = 0; y < n - x; y++) {
                    System.out.print(" ");
                }
                for (int z = 0; z < x; z++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
            System.out.print("Run again? (Y/N): ");
            char choice = in.next().trim().toUpperCase().charAt(0);
            if (choice != 'Y') {
                runAgain = false;
            }
        }
        in.close();
    }
}
