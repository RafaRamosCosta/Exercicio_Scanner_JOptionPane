package br.com.fiap;

import java.util.Scanner;

public class InputRaioScanner {
	public static void main (String[] args) {
		double raio = 0.0, area = 0.0;
		final double PI = 3.1416;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio: ");
			raio = scan.nextDouble();
			area = PI * raio * raio;
			System.out.println("A área do círculo é: " + area);
			
		} catch (Exception e) {
			System.out.println("Formato de número incorreto");
			
		}
	}

}
