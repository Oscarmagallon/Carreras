package proyecto_carrera;

import java.util.Scanner;
/*
 * @author Oscar Magallon
 */

public class Main {

	public static int pintaMenu() {

		int opc = 0;

		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("Menu carrera");
			System.out.println("Pulsa 1 para arrancar el coche.");
			System.out.println("Pulsa 2 para acelerar");
			System.out.println("Pulsa 3 para frenar");
			System.out.println("Pulsa 4 para rearrancar");
			opc = leer.nextInt();
			
		} while (opc < 1 || opc > 4);

		return opc;
	}

	public static void main(String[] args) {

		int opc = 0;

		Coche c = new Coche("Pepe", 23);

		do {
			opc = pintaMenu();

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
		} while (c.getKilometrosRecorridos() <= c.getDistanciaCarrera());

	}

}
