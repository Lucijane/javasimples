package algoritimo.io;

import java.util.Scanner; //ctrl =shift O

public class A01_ComandosDeEntrada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = leitor.nextLine();
		
		System.out.println("Digite idade");
		int idade = leitor.nextInt();
		
		System.out.println("Digite altura");
		float altura = leitor.nextFloat();
		
		System.out.println("Digite seu peso");
		double peso = leitor.nextDouble();
		
		
	
		System.out.println("Digite seu tipo sanguineo");
		char tipoSanguineoe = leitor.next().charAt(0);
		
		
		
		
		
		
		
		System.out.println("O nome digitado foi  " + nome);
		System.out.println("idade: " + idade); 
		System.out.println("altura: " + altura); // virgula
		
		
		
		
		
		leitor.close(); // para nao ter vazamento de memoria.
	}

}
