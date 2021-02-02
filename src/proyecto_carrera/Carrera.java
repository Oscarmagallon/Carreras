package proyecto_carrera;

import java.util.Scanner;

public class Carrera {
	private Coche vCoche[] = new Coche [10];
	private String nombre;
	private int dorsal;
	
	
	
	public Carrera(proyecto_carrera.Coche[] coche, String nombre, int dorsal) {
		super();
		this.vCoche = coche;
		this.nombre = nombre;
		this.dorsal = dorsal;
	}



	public void anadirCoche() {
		Scanner leer = new Scanner(System.in);
		for(int i= 0; i<vCoche.length;i++) {
			if (vCoche[i]==null) {
				System.out.println("Que nombre tiene el piloto");
				nombre=leer.next();
				System.out.println("Que dorsal tiene");
				dorsal=leer.nextInt();
				vCoche[i]=new Coche(nombre, dorsal,100 );
				
			}
		}
	}
	
	
	

}
