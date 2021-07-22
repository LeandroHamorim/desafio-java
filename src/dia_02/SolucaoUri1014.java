package dia_02;

import java.util.Scanner;

public class SolucaoUri1014 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int distanciaPecorrida = sc.nextInt();
		double combustivelGasto = sc.nextDouble();
		
		double consumoMedio = distanciaPecorrida / combustivelGasto;
		System.out.println(String.format("%.3f", consumoMedio)+" km/l");
		// System.out.printf("%.3f km/l", consumoMedio);
		sc.close();
		
	}

}
