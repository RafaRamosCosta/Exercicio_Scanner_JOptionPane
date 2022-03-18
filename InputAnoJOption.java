package br.com.fiap;

import javax.swing.JOptionPane;

public class InputAnoJOption {

	public static void main(String[] args) {
		int ano_atual = 0, ano_nascimento = 0, idade = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o ano atual: ");
			ano_atual = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
			ano_nascimento = Integer.parseInt(aux);
			idade = ano_atual - ano_nascimento;
			JOptionPane.showMessageDialog(null, "Você tem: " + idade);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}
		

	}

}
