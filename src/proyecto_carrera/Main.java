package proyecto_carrera;

import java.util.Scanner;
/*
 * @author Oscar Magallon
 */

public class Main {

	

	public static void main(String[] args) {

		int opc =0;
		int opcion= 0;
		Carrera carrera = null;
		Coche c = new Coche("Pepe", 26, 100);
	
		do {
			opcion=Menu.menuCarrera();
			switch (opcion) {
			case 1:
				String nomCar;
				int distancia;
				Scanner leer = new Scanner(System.in);
				System.out.println("¿Que nombre tiene la carrera?");
				nomCar = leer.next();
				System.out.println("Dime la distancia de la carrera");
				distancia=leer.nextInt();
				
				
				carrera = new Carrera(nomCar,distancia);
				break;

			case 2:
				try {
					carrera.anadirCoche();
				}catch (Exception e) {
					System.out.println("La carrera no se ha configurado aun");
				}
				
				break;
				
			case 3:
				carrera.empezar();
				do {
					opc = Menu.pintarMenu();
					System.out.println(c);
					switch (opc) {
					case 1: {
						c.arrancar();
						break;
					}
					case 2: {
						c.acelerar();
						break;
					}
					case 3: {
						c.frenar();
						break;
					}
					case 4: {
						c.arrancar();
						break;
					}
					}
				} while (!c.getEstadoCoche().equalsIgnoreCase("Terminado"));
				
			}
		} while (!c.getEstadoCoche().equalsIgnoreCase("terminado"));

	}
	

}
