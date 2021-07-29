package dia_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolucaoUri1050 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		Map<Integer, String> dddMap = new HashMap<>() {
			{
				put(61, "Brasilia");
				put(71, "Salvador");
				put(11, "Sao Paulo");
				put(21, "Rio de Janeiro");
				put(32, "Juiz de Fora");
				put(19, "Campinas");
				put(27, "Vitoria");
				put(31, "Belo Horizonte");
			}
		};
		int dddNumber = sc.nextInt();
		if (dddMap.containsKey(dddNumber)) {
			System.out.println(dddMap.get(dddNumber));
		} else {
			System.out.println("DDD nao cadastrado");
		}
		sc.close();
		
		// Com switch case
		/*
		switch(dddNumber){
        case 11:
            System.out.println("Sao Paulo");
            break;
        case 61:
            System.out.println("Brasilia");
            break;
        case 71:
            System.out.println("Salvador");
            break;
        case 21: 
            System.out.println("Rio de Janeiro");
            break;
        case 32:
            System.out.println("Juiz de Fora");
            break;
        case 19:
            System.out.println("Campinas");
            break;
        case 27:
            System.out.println("Vitoria");
            break;
        case 31:
            System.out.println("Belo Horizonte");
            break;
        default:
            System.out.println("DDD nao cadastrado");
    }
		 */
	}

}
