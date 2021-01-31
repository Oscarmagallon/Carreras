package proyecto_carrera;

import java.util.Scanner;

public class Coche {

private String nombrePiloto;
private int dorsal;
private int distanciaCarrera;
private String estadoCoche;
private int potencia;
private int velocidad;
private int kilometrosRecorridos;
private final int POTENCIA=50;
public Coche(String nombrePiloto, int dorsal) {
	this.nombrePiloto = nombrePiloto;
	this.dorsal = dorsal;
	this.distanciaCarrera= 7500;
	this.estadoCoche="Parado";
	this.velocidad=0;
	this.kilometrosRecorridos=0;

	
}

public String getNombrePiloto() {
	return nombrePiloto;
}

public void setNombrePiloto(String nombrePiloto) {
	this.nombrePiloto = nombrePiloto;
}

public int getDorsal() {
	return dorsal;
}

public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}

public int getDistanciaCarrera() {
	return distanciaCarrera;
}

public void setDistanciaCarrera(int distanciaCarrera) {
	this.distanciaCarrera = distanciaCarrera;
}

public String getEstadoCoche() {
	return estadoCoche;
}

public void setEstadoCoche(String estadoCoche) {
	this.estadoCoche = estadoCoche;
}

public int getPotencia() {
	return potencia;
}

public void setPotencia(int potencia) {
	this.potencia = potencia;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

public int getKilometrosRecorridos() {
	return kilometrosRecorridos;
}

public void setKilometrosRecorridos(int kilometrosRecorridos) {
	this.kilometrosRecorridos = kilometrosRecorridos;
}

public int getPOTENCIA() {
	return POTENCIA;
}

public void pintarMenu() {
	int opc=0;
	Scanner leer=new Scanner(System.in);
	do {
		System.out.println("Menú de opciones para la carrera");
		System.out.println("Pulsa 1 para arrancar");
		System.out.println("Pulsa 2 para acelerar");
		System.out.println("Pulsa 3 para frenar");
		System.out.println("Pulsa 4 para rearrancar");
		System.out.println("Pulsa 5 para abanconar la carrera");
		System.out.println("Escribe un numero:");
		opc=leer.nextInt();
		switch (opc) {
		case 1: estadoCoche="MARCHA";
		case 4:
		}
		
	} while (opc>0&&opc<6);
}
public void arrancar() {
	
	
	switch (this.estadoCoche) {
	case "PARADO":
		this.setEstadoCoche("MARCHA");
		System.out.println("Has arrancado el coche");
		break;
	case "MARCHA":
		System.out.println("Tu coche ya esta en marcha, has perdido el turno");
		break;
		
	case "ACCIDENTADO":
		System.out.println("Tu coche esta accidentado, debes rearrancarlo en el turno siguiente");
		break;
		
	case "TERMINADO":
		System.out.println("Ya has terminado la carrera");
		break;
	
	}
	
}
}






