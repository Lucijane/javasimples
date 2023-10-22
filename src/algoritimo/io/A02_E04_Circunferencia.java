package algoritimo.io;

import javax.swing.JOptionPane;

public class A02_E04_Circunferencia {

	public static void main(String[] args) {
		//recaba o raio e de uma circunferencia e calcule seu comprimento e a area;
		
		int raio = 2;
		
		Double c =  2 * raio * Math.PI;
		Double area = Math.PI * Math.pow(raio,2);
		
		System.out.println(c);
		System.out.println(area); 
		
		JOptionPane.showMessageDialog(null, area);
		JOptionPane.showMessageDialog(null, c);
		
		
		
		{
			
			
			
		}

	}

}
