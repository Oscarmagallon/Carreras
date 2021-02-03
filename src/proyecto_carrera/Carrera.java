package proyecto_carrera;
import java.util.Scanner;

public class Carrera {
	private Coche vCoche[];
	private String nombre;
	private int distancia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Carrera(String nombre, int distancia) {
		this.vCoche =  new Coche [10];
		this.nombre = nombre;
		this.distancia = distancia;
	}

	public boolean carreraTerminada() {
		for (Coche coche : vCoche) {
			if(coche!=null && coche.getEstadoCoche().equalsIgnoreCase("marcha")) {
				return false; 
			}
		}
		return true;
	}
	
	public void empezar() {
		for (int i = 0; i < vCoche.length; i++) {
			if(vCoche[i] != null) {
				vCoche[i].setEstadoCoche("Marcha");
			}
		}
		
	}

	public void anadirCoche() {
		int dorsal;
		Scanner leer = new Scanner(System.in);
		for(int i= 0; i<vCoche.length;i++) {
			if (vCoche[i]==null) {
				System.out.println("Que nombre tiene el piloto");
				nombre=leer.next();
				do {
					System.out.println("Que dorsal tiene");
					dorsal=leer.nextInt();
				} while (comprobarDorsal(dorsal)==true);
				
				vCoche[i]=new Coche(nombre, dorsal, 1000);
				break;
				
			}
		}
	}
	
	public boolean rearrancar() {
		for (Coche coche : vCoche) {
			if( coche != null && coche.getEstadoCoche().equals("Terminado")) {
				return false;
			}
		}
		return true;
	}
	
	public boolean comprobarDorsal(int dorsal) {
		for (Coche coche : vCoche) {
			if(coche!=null && dorsal== coche.getDorsal()) {
				return true;
				
			}
		}
		return false;
	}

	

}
