package paraFor.exercicio._07;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe o valor de N: ");
		n = scanner.nextInt();
		
		System.out.println("");
		
		for (int i = 1; i <= n; i++) {
			int linha = i;
			int valorAoQuadrado = i * i;
			int valorAoCubo = i * i * i;
			
			System.out.printf("%d %d %d\n", linha, valorAoQuadrado, valorAoCubo);
		}
		
		scanner.close();
	}
	
}
