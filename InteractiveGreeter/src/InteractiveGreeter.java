import java.util.Scanner;
public class InteractiveGreeter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name, where, like;
		int age, donate;
		System.out.print("What is your name? ");
		name = in.nextLine();
		System.out.print("Where are you from? ");
		where = in.nextLine();
		System.out.print("What is your age? ");
		age = in.nextInt();
		System.out.printf("Hello, %s, from, %s, age %d\n", name, where, age);
		System.out.println("What is something you like to do? ");
		like = in.nextLine();
		System.out.printf("Have a good time next time you %s!\n", like);
		System.out.print("How much would you like to donate today? ");
		donate = in.nextInt();
		System.out.printf("You will donate $%d today. Yay!", donate);
		in.close();
	}
}
