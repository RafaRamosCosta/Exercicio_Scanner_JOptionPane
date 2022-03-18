package br.com.fiap;

import java.util.Scanner;

public class InputAnoScanner {

	public static void main(String[] args) {
		int ano_atual = 0, ano_nascimento = 0, idade = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual: ");
			ano_atual = scan.nextInt();
			System.out.println("Digite seu ano de nascimento: ");
			ano_nascimento = scan.nextInt();
			idade = ano_atual - ano_nascimento;
			System.out.println("Você tem: " + idade);
			
		} catch (Exception e) {
			System.out.println("Formato de número incorreto");
			
		}
		

	}

}
