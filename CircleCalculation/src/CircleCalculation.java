import java.util.Scanner;
public class CircleCalculation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r, d, a, c;
		System.out.print("Radius?");
		r = in.nextDouble();
		d = 2*r;
		System.out.printf("Diameter %f ", d);
		a = Math.PI*r*r;
	    System.out.printf("Area %f ", a);
	    c = Math.PI*d;
	    System.out.printf("Circumference %f", c);
	    in.close();
	}
}
