package canSpell;
public class canSpell {
	public static void main(String[] args) {
		String letter = "t";
		String letter2 = "h";
		String letter3 = "e";
		String letter4 = "n";
		String input = "diowefjthen";
		//System.out.println(input.contains(letter));
		//System.out.println(input.contains(letter2));
		//System.out.println(input.contains(letter3));
		//System.out.println(input.contains(letter4));
		int maxlength = 7;
		if (input.length()>maxlength) {
			System.out.println("Cheater!");
		}
		if (input.contains(letter) &&
				input.contains(letter2) &&
				input.contains(letter3) &&
				input.contains(letter4)) {
			System.out.println("then can be spelt");
		} else {
			System.out.println("word 'then' cannot be spelt");
			}
		if (input.contains(letter) &&
				input.contains(letter3) &&
				input.contains(letter4)) {
			System.out.println("ten can be spelt");
		} else {
			System.out.println("word 'the' then cannot be spelt");
			}
		if (input.contains(letter) &&
				input.contains(letter3) &&
				input.contains(letter4)) {
			System.out.println("net can be spelt");
		} else {
			System.out.println("word 'net' then cannot be spelt");
			}
	}
}