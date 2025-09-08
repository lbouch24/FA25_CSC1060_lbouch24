import java.util.Scanner;
public class TemperatureConversion {
	public static void main(String[] args) {
		int F;
		double C;
		double K;
		Scanner in = new Scanner(System.in);
		System.out.print("Temperature in F");
		F = in.nextInt();
		double CPerF = (F-32)*5/9;
		C = CPerF;
		double KPerC = +273.15;
		K = C + KPerC;
		System.out.printf(F + "F= ");
		System.out.printf(C + "C" +", ");
		System.out.printf(K + "K");
	}
}
