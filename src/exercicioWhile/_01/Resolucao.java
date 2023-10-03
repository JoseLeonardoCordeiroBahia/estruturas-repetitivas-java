package exercicioWhile._01;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Informe a senha: ");
		senha = scanner.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			
			System.out.println("");
			
			System.out.print("Informe a senha novamente: ");
			senha = scanner.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		scanner.close();
	}

}
