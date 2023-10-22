package exercicios01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class E02_Idade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade=0,anoNascimento = 0, anoAtual=0;
		System.out.println("Digite o ano do nascimento");
		
		anoAtual = leitor.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.println("A soma em anos é: "+idade);
		System.out.println("A soma em meses é: "+idade*12);
		System.out.println("A soma em dias é: "+(idade*365+(idade/4)));
		// api de datas = LocalDate
		LocalDate aniversario = LocalDate.of(idade, anoNascimento, anoAtual);
		 
		System.out.println(aniversario.until(LocalDate.now(),ChronoUnit.YEARS));
		System.out.println(aniversario.until(LocalDate.now(),ChronoUnit.MONTHS));
		System.out.println(aniversario.until(LocalDate.now(),ChronoUnit.DAYS));
		
		
		
		
		
		

	}

}
