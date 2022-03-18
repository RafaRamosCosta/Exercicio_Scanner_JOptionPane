package br.com.fiap;

import javax.swing.JOptionPane;

public class InputRaioJOption {

	public static void main(String[] args) {
		double raio = 0, area = 0;
		final double PI = 3.1416;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite um valor de raio: ");
			raio = Double.parseDouble(aux);
			area = PI * raio * raio;
			JOptionPane.showMessageDialog(null, "A �rea do c�rculo �: " + area);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de n�mero incorreto");
		}
		

	}

}
