package exercicioWhile._03;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigo;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println(" .............................");
		System.out.println("| CÓDIGO      COMBUSTÍVEL     |");
		System.out.println("| 1           Álcool          |");
		System.out.println("| 2           Gasolina        |");
		System.out.println("| 3           Diesel          |");
		System.out.println("| 4           Sair            |");
		System.out.println(" .............................");
		
		System.out.print("Informe o codigo do combustível abastecido: ");
		codigo = scanner.nextInt();
		
		while (codigo != 4) {
			if (codigo == 1) {
				alcool = alcool + 1;
			} else if (codigo == 2) {
				gasolina  = gasolina  + 1;
			} else if (codigo == 3){
				diesel  = diesel  + 1;
			} 
			
			System.out.print("Informe o codigo do combustível abastecido: ");
			codigo = scanner.nextInt();
			
		}
		
		System.out.println("");
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina );
		System.out.println("Diesel: " + diesel );
		
		
		scanner.close();
	}

}
