package programacaoestruturada;

import java.util.Scanner;

public class E01_Idades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		if(idade <=13) {
			System.out.println("Criança");
			
		}
		else if (idade > 13  &&  idade <=20 ) {
			System.out.println("Adolescente");
		}
		else {
			System.out.println("Adulto");
		}
		sc.close();
	}

}
