package exercicioWhile._02;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int coordenadaX;
		int coordenadaY;
		
		System.out.print("Informe a coordenada X: ");
		coordenadaX = scanner.nextInt();
		
		System.out.print("Informe a coordenada X: ");
		coordenadaY = scanner.nextInt();
		
		while (coordenadaX != 0  && coordenadaY != 0) {
			if (coordenadaX > 0 && coordenadaY > 0) {
				System.out.println("primeiro");
			} else if (coordenadaX < 0 && coordenadaY > 0) {
				System.out.println("segundo");
			} else if (coordenadaX < 0 && coordenadaY < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			System.out.println("");
			
			System.out.print("Informe a coordenada X: ");
			coordenadaX = scanner.nextInt();
			
			System.out.print("Informe a coordenada X: ");
			coordenadaY = scanner.nextInt();
		}
		
		scanner.close();
	}

}
