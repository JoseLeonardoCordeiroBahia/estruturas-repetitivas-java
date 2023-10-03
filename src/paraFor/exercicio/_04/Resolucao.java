package paraFor.exercicio._04;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe o valor de N: ");
		n = scanner.nextInt();
		
		System.out.println("");
		
		for (int i = 0; i < n; i++) {
			int valor1;
			int valor2;
			
			System.out.print("Informe o valor 1: ");
			valor1 = scanner.nextInt();
			
			System.out.print("Informe o valor 2: ");
			valor2 = scanner.nextInt();
			
			if (valor2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				double divisao = (double) valor1 / (valor2);
				System.out.println(divisao);
			}
			
			System.out.println("");
			
		}
		
		scanner.close();
	}
	
}
