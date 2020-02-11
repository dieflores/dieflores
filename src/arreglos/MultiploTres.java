package arreglos;

import java.util.ArrayList;

public class MultiploTres {

	public static ArrayList<Integer> main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numero = new ArrayList<Integer>();

		numero.add(10);
		numero.add(20);
		numero.add(30);
		numero.add(33);
		numero.add(21);
		numero.add(8);
		numero.add(2);
		numero.add(61);

		System.out.println(numero);

	
			ArrayList<Integer> multiplos = new ArrayList<Integer>();
			for(int i = 0; i < args.length; i++) {
				int num = Integer.parseInt(args[i]);
				if (num % 3 == 0) {
					multiplos.add(num);
				}
			}
			return multiplos;
		}
	}

}
