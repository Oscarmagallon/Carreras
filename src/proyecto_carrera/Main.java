package proyecto_carrera;

import java.util.Scanner;
/*
 * @author Oscar Magallon
 */

public class Main {

	

	public static void main(String[] args) {

		int opc = 0;

		Coche c = new Coche("Pepe", 26, 100);

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

}
