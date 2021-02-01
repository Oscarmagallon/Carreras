package proyecto_carrera;

import java.util.Scanner;

public class Menu {
	public static int pintarMenu() {

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
}
