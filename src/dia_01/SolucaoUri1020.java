package dia_01;

import java.util.Scanner;

public class SolucaoUri1020 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		final int ano = 365;
		final int mes = 30;

		int idadeAnos = 0;
		int idadeMeses = 0;
		int idadeDias = 0;
		int restoDivisao = 0;
		int divisao = 0;

		System.out.println("Informe a idade em dias: ");
		int idade = sc.nextInt();
		
	
			divisao =  (int) Math.floor(idade / ano);
			restoDivisao = idade % ano;

			idadeAnos = (int) divisao;

			idadeMeses = (int) Math.floor(restoDivisao / mes);
			idadeDias = restoDivisao % mes;

			System.out.println(idadeAnos + " ano(s)");
			System.out.println(idadeMeses + " mes(es)");
			System.out.println(idadeDias + " dia(s)");

		sc.close();
	}

}
