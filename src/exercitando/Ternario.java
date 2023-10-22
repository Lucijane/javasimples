package exercitando;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double preco = 34.5;
      //caso preço seja menor que 20 eu vou querer preço * 0.01 caso cotratio preço *0.05
      double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
      
      System.out.println(desconto);
		
			
	}

}
