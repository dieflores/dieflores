package arreglos;

import java.util.ArrayList;

public class Visita2 {

	public static void main(String[] args) {

		ArrayList<Integer> visitas = new ArrayList<Integer>();
		visitas.add(3001);
		visitas.add(1402);
		visitas.add(1304);
		visitas.add(1505);

		for (i = 0; i < visitas; i++) {

		}

	}

	public static float promedio(ArrayList<Integer> visitas) {
		float promedio;
		int suma = 0;
		for (int visita : visitas) {
			suma += visita;

		}
		promedio = suma / visitas.size();
		return promedio;
	}

}