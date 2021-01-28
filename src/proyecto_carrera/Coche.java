package proyecto_carrera;

public class Coche {

private String nombrePiloto;
private int dorsal;
private int distanciaCarrera;
private String estadoCoche;
private final int POTENCIA=50;
private int velocidad;
private int kilometrosRecorridos;
public Coche(String nombrePiloto, int dorsal) {
	this.nombrePiloto = nombrePiloto;
	this.dorsal = dorsal;
	this.distanciaCarrera= 7500;
	this.estadoCoche="Parado";
	this.velocidad=0;
	this.kilometrosRecorridos=0;
	
}
public void arrancar() {
	switch (this.estadoCoche) {
	case "PARADO":
		System.out.println("El coche esta parado");
		
		
		break;
	case "MARCHA":
		System.out.println();
		break;
	}
}





}
