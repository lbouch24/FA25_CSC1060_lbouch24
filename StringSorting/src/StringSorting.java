import java.util.Scanner;
public class StringSorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of strings:");
		int count = in.nextInt();
		in.nextLine();
		String[] out = new String[count];
		for(int i = 0; i < count; i++) {
			System.out.print("Enter a string:");
			out[i] = in.nextLine();
		}
		System.out.println("\nSorted:");
		bubbleSort(out, true);
		printArray(out);
		System.out.println("\nReverse Sorted:");
		bubbleSort(out, false);
		printArray(out);
		in.close();
	}
	public static void bubbleSort(String[] array, boolean ascending) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(ascending) {
					if(array[j].compareTo(array[j + 1]) >0) {
						String temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				} else {
					if(array[j].compareTo(array[j + 1]) < 0) {
						String temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
	}
	public static void printArray(String[] array) {
		for(String s : array) {
			System.out.println(s);
		}
	}
}

