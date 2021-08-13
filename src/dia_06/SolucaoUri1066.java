package dia_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolucaoUri1066 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		int odd = 0, even = 0, positive = 0, negative = 0;

		for (int i = 0; i < 5; i++) {
			numbers.add(sc.nextInt());
			if (numbers.get(i) % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			if (numbers.get(i) > 0) {
				positive++;
			} else if (numbers.get(i) < 0) {
				negative++;
			}
		}
		sc.close();

		System.out.println(even + " valor(es) par(es)");
		System.out.println(odd + " valor(es) impar(es)");
		System.out.println(positive + " valor(es) positivo(s)");
		System.out.println(negative + " valor(es) negativo(s)");
	}

}
