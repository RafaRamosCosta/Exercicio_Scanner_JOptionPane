package br.com.fiap;

import javax.swing.JOptionPane;

public class EmtradaJOptionPane {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite um n�mero");
			num1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite outro n�mero");
			num2 = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null,
				"valor 1: " + num1 + "\nvalor 2: " + num2 +
				"\nsoma dos valores = " + (num1 + num2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de n�mero incorreto!");
		}
		
	}

}
