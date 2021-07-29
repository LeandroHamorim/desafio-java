package dia_03;

import java.util.Scanner;

public class SolucaoUri1035 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if( b > c && d > a && c + d > a +b && c > 0 && d > 0 ) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores não aceitos");
		}
		
		sc.close();
	}

}
