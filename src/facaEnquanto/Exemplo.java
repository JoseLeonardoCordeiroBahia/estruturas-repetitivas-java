package facaEnquanto;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);

		char resposta;
		
		do {
			double c;
			double f;
			
			System.out.print("Digite a temperatura em Celsius: ");
			c = scanner.nextDouble();
			
			f = 9.0 * c / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", f);
			
			System.out.print("Deseja repetir (s/n)? ");
			resposta = scanner.next().charAt(0);
		} while (resposta != 'n');
		
		scanner.close();
	}
}
