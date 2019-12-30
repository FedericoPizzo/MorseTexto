package traductor;

import java.util.HashMap;

public class MetodosTraductor {

	public static String decodeBits2Morse(String input) {

		String[] palabras = input.split("01");
		StringBuilder builderBits = new StringBuilder();
		double num = 0;

		for (String c : palabras) {

			if (c.isEmpty()) {
				builderBits.append(".");
			} else {
				num = Double.parseDouble(c);
			}
			if (num == 0) {
				builderBits.append("");
			} else if (!c.contains("11111") && c.contains("1")) {
				builderBits.append(".");
				if (c.contains("000")) {
					builderBits.append(" ");
				}
			} else if (c.contains("11111") && c.contains("1")) {
				builderBits.append("-");
				if (c.contains("000")) {
					builderBits.append(" ");
				}
			}
			if (c.contains("000000000")) {
				builderBits.append("  ");
			}
		}

		return builderBits.toString();

	}

	public static String translate2Human(String input) {

		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put(" ", " ");
		dictionary.put(".-", "A");
		dictionary.put("-...", "B");
		dictionary.put("-.-.", "C");
		dictionary.put("-..", "D");
		dictionary.put(".", "E");
		dictionary.put("..-.", "F");
		dictionary.put("--.", "G");
		dictionary.put("....", "H");
		dictionary.put("..", "I");
		dictionary.put(".---", "J");
		dictionary.put("-.-", "K");
		dictionary.put(".-..", "L");
		dictionary.put("--", "M");
		dictionary.put("-.", "N");
		dictionary.put("---", "O");
		dictionary.put(".--.", "P");
		dictionary.put("--.-", "Q");
		dictionary.put(".-.", "R");
		dictionary.put("...", "S");
		dictionary.put("-", "T");
		dictionary.put("..-", "U");
		dictionary.put("...-", "V");
		dictionary.put(".--", "W");
		dictionary.put("-..-", "X");
		dictionary.put("-.--", "Y");
		dictionary.put("--..", "Z");
		dictionary.put(".----", "1");
		dictionary.put("..---", "2");
		dictionary.put("...--", "3");
		dictionary.put("....-", "4");
		dictionary.put(".....", "5");
		dictionary.put("-....", "6");
		dictionary.put("--...", "7");
		dictionary.put("---..", "8");
		dictionary.put("----.", "9");
		dictionary.put("-----", "0");

		int j = 0;

		StringBuilder builderFrase = new StringBuilder();

		String[] palabras = input.split("   ");

		for (int i = 0; i <= palabras.length - 1; i++) {

			StringBuilder builderPalabras = new StringBuilder();

			String[] parts = palabras[j].split(" ");

			for (String c : parts) {
				if (c.equals("")) {
					builderPalabras.append("");
				} else {
					builderPalabras.append(dictionary.get((c).toUpperCase()));

				}
			}

			builderFrase.append(builderPalabras);
			builderFrase.append("  ");

			j++;
		}

		return builderFrase.toString();
	}

}
