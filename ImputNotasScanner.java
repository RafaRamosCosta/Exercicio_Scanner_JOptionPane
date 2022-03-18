package br.com.fiap;

import java.util.Scanner;

public class ImputNotasScanner {
	public static void main(String[] args) {
		float p1 = 0.0f, p2 = 0.0f, p3 = 0.0f, p4 = 0.0f;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite as 4 notas de prova");
			p1 = scan.nextFloat();
			p2 = scan.nextFloat();
			p3 = scan.nextFloat();		
			p4 = scan.nextFloat();
			System.out.println("Sua média é: " + (p1 + p2 + p3 + p4) /4);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto");
			
		}

	}

}
