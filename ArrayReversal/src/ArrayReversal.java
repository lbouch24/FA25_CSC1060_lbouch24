import java.util.Scanner;
public class ArrayReversal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[100];
		int count = 0;
		System.out.println("Enter integers for the array, enter -1 to stop");
		 while (true) {
	            int i = in.nextInt();
	            if (i == -1) {
	                break;
	            }
	            if (count < numbers.length) {
	                numbers[count] = i;
	                count++;
	            } else {
	                System.out.println("Array is full.");
	                break;
        }
	}
		 System.out.println("Numbers in reverse order:");
	        for (int i = count - 1; i >= 0; i--) {
	            System.out.println(numbers[i]);
	        }

	        in.close();
	}
}