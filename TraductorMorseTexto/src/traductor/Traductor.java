package traductor;

import traductor.MetodosTraductor;
import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) {

		String morse, texto;

		Scanner scan = new Scanner(System.in);

		String input = "";

		while (input.equals("")) {
			System.out.println("\n" + "Ingrese una secuencia de bits: " + "\n");
			input = scan.nextLine();
			if (!input.matches("^[0-1]*$")) {
				input = "";
			}

		}

		morse = MetodosTraductor.decodeBits2Morse(input);

		texto = MetodosTraductor.translate2Human(morse);

		System.out.println("\n" + "Código Morse: " + morse + "\n");
		System.out.println("Texto: " + texto + "\n");
	}

}
