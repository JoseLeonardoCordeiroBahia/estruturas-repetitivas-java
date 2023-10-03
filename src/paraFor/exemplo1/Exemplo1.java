package paraFor.exemplo1;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int quantidade;
		int soma = 0;
		
		System.out.print("Informe a quantidade de vezes para informar os números: ");
		quantidade = scanner.nextInt();

		System.out.println("");
		
		for (int i = 0; i < quantidade; i++) {
			int numero;
			
			System.out.print("Informe um número para inlcuir na soma: ");
			numero = scanner.nextInt();
			
			soma = soma + numero;
		}
		
		System.out.println(soma);
		
		scanner.close();
	}
	
}
