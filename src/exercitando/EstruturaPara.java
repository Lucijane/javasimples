package exercitando;

import java.util.Scanner;

public class EstruturaPara {

	public static void main(String[] args) {
		//Escreva um algoritmo que calcule a soma dos números de 1 a 15.
		
		/*Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i <= x; i++) {
		soma= soma + i;	
		
		}
		
		System.out.println(soma);*/
		
		// Leia o nome do usuário e escreva o nome dele na tela 10 vezes
		/*System.out.println("Digite um nome");
		Scanner sc = new Scanner(System.in);
		 
	    String nome = sc.nextLine();
	     for(int i = 0; i < 10; i++ ) {
	    	 System.out.println(nome);
	     }*/
		
		//  Leia o nome um número do usuário um número N e escreva o nome dele na tela N
		//vezes. 
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome");
		String nome= sc.nextLine();
		
		System.out.println("Quantidade de vezes");
		int n= sc.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println(nome);
			
		}	
		
	}

}
