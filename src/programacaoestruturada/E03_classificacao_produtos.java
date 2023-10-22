package programacaoestruturada;

import java.util.Scanner;

public class E03_classificacao_produtos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		 
		
		switch (cod) {
		 	
		 case 1: System.out.println("Alimento Perecivel ");break; //return - ele nao retornaria o println la de baixo o "continu"
		 case 2,3,4 : System.out.println("Alimento nao Perecivel ");break;
		 case 5,6: System.out.println("Vestuario ");break;
		 case 7,8,9,10,11,12: System.out.println("xxxx");break;
		 
		 default: System.out.println("opcao ivalida");// caso nada seja verdadeiro
		
		}
		
		
	}

}
