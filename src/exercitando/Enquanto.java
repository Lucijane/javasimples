package exercitando;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // ler o primeiro valor 
		int soma = 0;
		while(x != 0) {
			soma += + x;
			x=sc.nextInt();
		}
		System.out.println(soma);
				
		sc.close();
			
		
		
		
	}

}
