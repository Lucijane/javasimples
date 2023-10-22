package programacaoestruturada;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double nota01=0 , nota02=0 , media=0 , notaRecuperacao=0;

		boolean notaValida = nota01 >= 0 && nota01 <= 10 && nota02 >= 0 && nota02 <= 10;
        
		System.out.println("Digite a primira nota");
		nota01 = leitor.nextDouble();
		
		System.out.println("Digite a primira nota");
		nota02 = leitor.nextDouble();
		
		media = (nota01 + nota02) / 2;

		if (media >= 7 && notaValida) {
			System.out.println("passou");

		} else if (media >= 3 && media < 7 && notaValida) {
			System.out.println("em recuperação");

			String resposta = "";

			System.out.println("digite a nota da recuperação");
			notaRecuperacao = leitor.nextDouble();

			if (notaRecuperacao < 0 && notaRecuperacao > 10) {
				resposta = "nota inválidas";
			} else {
				resposta = notaRecuperacao >= 6 && notaValida ? "Aprovado" : "Reprovado";
			}
			System.out.println(resposta);

		} else if (media < 3 && notaValida) {
			System.out.println("reprovado");

		} else {
			System.out.println("notas inválidas");
		}
		
		
		/*if (media >= 7 && notaValida) {
			System.out.println("VOCE PASSOU");
		} else if (media >= 3 && media < 7 && notaValida) {
			System.out.println("VOCE ESTA DE RECUPERACAO");
		} else if (media < 3 && notaValida) {
			System.out.println(" VOCE ESTA DE RECUPERACAO");
		} else {
			System.out.println("NOTA INVALIDA");
		}*/
		leitor.close();
	}

}
