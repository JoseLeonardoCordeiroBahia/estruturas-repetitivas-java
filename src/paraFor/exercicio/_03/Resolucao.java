package paraFor.exercicio._03;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe o valor N: ");
		n = scanner.nextInt();
		
		System.out.println("");
		
		for (int i = 0; i < n; i++) {
			double valor1;
			double valor2;
			double valor3;
			double media;
			
			System.out.print("Informe o valor 1: ");
			valor1 = scanner.nextDouble();
			
			System.out.print("Informe o valor 2: ");
			valor2 = scanner.nextDouble();
			
			System.out.print("Informe o valor 3: ");
			valor3 = scanner.nextDouble();
			
			media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;
			
			System.out.printf("%.1f\n\n", media);
		}
		
		scanner.close();
	}
	
}
