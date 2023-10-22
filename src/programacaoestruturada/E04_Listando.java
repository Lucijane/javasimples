package programacaoestruturada;

import java.util.Scanner;

import javax.swing.text.DefaultCaret;

public class E04_Listando {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Digite um codigo");
		int cod = 1;

		double produto = 100;
		double taxa = 0;
		int parcela = 1;

		switch (cod) {

		case 1:
			taxa = -8;
			break; // return - ele nao retornaria o println la de baixo o "continu"
		case 2:
			taxa = -4;
			break;
		case 3:
			parcela = 2;
			break;
		case 4:
			parcela = 4;
			taxa = 8;
			break;

		default:
			System.out.println("OPCAO INVALIDA");
		}

		double precoFinal = produto += (produto * taxa / 100);
		double produtoParcela = precoFinal / parcela;

		System.out.println(produto);
		System.out.println(precoFinal);
		System.out.println(parcela);
		System.out.println(produtoParcela);
	}
}
