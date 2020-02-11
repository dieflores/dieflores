package arreglos;

import java.util.ArrayList;

public class SmartWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> cuentaPasos = new ArrayList<Integer>();
		cuentaPasos.add(300);
		cuentaPasos.add(405);
		cuentaPasos.add(403);
		cuentaPasos.add(506);
		cuentaPasos.add(100020040);
		cuentaPasos.add(45006);
		cuentaPasos.add(-1004);

		Integer mayor = 100000;

		for (int paso : cuentaPasos) {
			if (paso <= mayor && paso >= 200) {
				cuentaPasos.remove(cuentaPasos);
				System.out.println(paso);
			}
		}

	}

}
