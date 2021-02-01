package proyecto_carrera;

import java.util.Scanner;

public class Carrera {
	private Coche Coche[] = new Coche [10];
	private String nombre;
	private int dorsal;
	
	
	public void anadirCoche() {
		Scanner leer = new Scanner(System.in);
		for(int i= 0; i<Coche.length;i++) {
			if (Coche[i]==null) {
				System.out.println("Que nombre tiene el piloto");
				nombre=leer.next();
				System.out.println("Que dorsal tiene");
				dorsal=leer.nextInt();
				Coche[i]=new Coche(nombre, dorsal,100 );
				
			}
		}
	}
	
	
	

}
