package arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Visitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> numeros = Arrays.asList(1,9,2,10,2,4,7,4,7,1,4);
		
		int ejercicio1 = numeros.stream().reduce(0,(a,b)->a+b); 
		System.out.println(ejercicio1);
		
		int ejercicio2 = numeros.stream().distinct().reduce(0,(a,b)->a+b);
		System.out.println(ejercicio2); 
		
		List<Float>ejercicio3=numeros.stream().map(c-> (float)c).collect(Collectors.toList());
		System.out.println(ejercicio3);
				
		List<Integer>ejercicio4=numeros.stream().distinct().filter(x->x>=5).collect(Collectors.toList());
		System.out.println(ejercicio4);
		
		int ejercicio6 = (int) numeros.stream().filter(x->x<5).count();
		System.out.println(ejercicio6);
		
		
		List<String> nombres=Arrays.asList("Anastasia","Beatriz","Clara","Carla","Marianela","Paula", "Pia");
		
		
		List<String> ejercicio01 = nombres.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(ejercicio01);
		
		List<String> ejercicio02 = nombres.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(ejercicio02);
		
		}

	}

