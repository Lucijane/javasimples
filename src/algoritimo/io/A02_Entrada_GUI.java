package algoritimo.io;

import javax.swing.JOptionPane;

public class A02_Entrada_GUI {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua iadade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura"));
		char tipoSanguineo = JOptionPane.showInputDialog(null,"Digite seu tipo Sanguineo").charAt(0);
		char fatorRh = JOptionPane.showInputDialog(null,"Digite seu tipo fator rh").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Olá " + nome + " \nidade " + idade + "\npeso " + peso + "\naltura " + altura +
		"\ntipoSanguineo " + tipoSanguineo +"\nfatorRh " + fatorRh);
		

	}

}
