import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.print("Grade?");
		x = in.nextInt();
			if (x < 0) {
				System.out.println("Error");
			} else if (x >= 92) {
			    System.out.println("A");
			} else if (x >= 89) {
			    System.out.println("A-");
			}else if (x >= 87) {
			    System.out.println("B+");
			}else if (x >= 82) {
			    System.out.println("B");
			}else if (x >= 79) {
			    System.out.println("B-");
			}else if (x >= 77) {
			    System.out.println("C+");
			}else if (x >= 72) {
			    System.out.println("C");
			}else if (x >= 69) {
			    System.out.println("C-");
			}else if (x >= 67) {
			    System.out.println("D+");
			}else if (x >= 60) {
			    System.out.println("D");
			}else if (x < 60) {
			    System.out.println("F");
			}
		in.close();
		}
}