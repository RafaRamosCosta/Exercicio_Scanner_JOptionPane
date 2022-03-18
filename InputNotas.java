package br.com.fiap;

import javax.swing.JOptionPane;

public class InputNotas {
	public static void main(String[] args) {
		float p1 = 0.0f, p2 = 0.0f, p3 = 0.0f, p4 =0.0f;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
			p1 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
			p2 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da terceira prova: ");
			p3 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da quarta prova: ");
			p4 = Float.parseFloat(aux);
			JOptionPane.showMessageDialog(null, "Sua média é: " + ((p1 + p2 + p3 + p4)/4));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato numérico incorreto");
			
		}
		
		
	}

}
