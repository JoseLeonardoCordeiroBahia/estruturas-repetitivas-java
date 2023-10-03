package paraFor.exercicio._02;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int in = 0;
		int out = 0;
		
		System.out.print("Informe o valor de N: ");
		n = scanner.nextInt();
		
		System.out.println("");
		
		for (int i = 0; i < n; i++) {
			System.out.print("Informe o valor X: ");
			int x = scanner.nextInt();
			
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		scanner.close();
	}
	
}
