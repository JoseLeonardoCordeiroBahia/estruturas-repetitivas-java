package paraFor.exercicio._06;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe o valor de N: ");
		n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}

}
