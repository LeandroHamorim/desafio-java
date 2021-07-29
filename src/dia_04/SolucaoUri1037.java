package dia_04;

import java.util.Scanner;
public class SolucaoUri1037 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var valor = sc.nextDouble();
		
		if (valor >= 0.0 && valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if (valor > 25.00  && valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
		}
		else if (valor > 50.00 && valor <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else if (valor > 75.00 && valor <= 100.00) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
