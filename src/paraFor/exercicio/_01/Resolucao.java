package paraFor.exercicio._01;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x;
		
		System.out.print("Informe o valor de X: ");
		x = scanner.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}

}
