package proyecto_carrera;

import java.util.Scanner;

public class Coche {

	private String nombrePiloto;
	private int dorsal;
	private int distanciaCarrera;
	private String estadoCoche;
	private int velocidad;
	private int kilometrosRecorridos;
	private final int POTENCIA = 50;

	public Coche(String nombrePiloto, int dorsal, int distanciaCarrera) {
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.distanciaCarrera = distanciaCarrera;
		this.estadoCoche = "Parado";
		this.velocidad = 0;
		this.kilometrosRecorridos = 0;

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



	public void arrancar() {
		if (this.getEstadoCoche().equalsIgnoreCase("PARADO")) {
			this.setEstadoCoche("MARCHA");
			System.out.println("Coche arrancado");

		} else if (this.getEstadoCoche().equalsIgnoreCase("MARCHA")) {

			System.out.println("Tu coche ya esta arrancado");
		} else if (this.getEstadoCoche().equals("ACCIDENTADO")) {
			this.setEstadoCoche("MARCHA");
			System.out.println("Coche arrancado");
		}
		
	}

public void acelerar() {
		
		if ((this.getEstadoCoche().equalsIgnoreCase("Parado"))||(this.getEstadoCoche().equalsIgnoreCase("accidentado"))) {
			System.out.println("Para acelerar primero tienes que arrancar el coche.");
		}else {
			if (this.getEstadoCoche().equalsIgnoreCase("Marcha")) {
				double r = Math.random()*this.POTENCIA+1;
				int aceleracion = (int)Math.floor(r);
				int velocidad = this.getVelocidad();
				int kilometros = this.getKilometrosRecorridos();
				
				velocidad += aceleracion;
				
				if (velocidad > 200) {
					this.setVelocidad(0);
					this.setEstadoCoche("ACCIDENTADO");
					System.out.println("Te has pasado de velocidad y te la has pegado.");
				}else {
					this.setVelocidad(velocidad);
					this.setKilometrosRecorridos(kilometros+aceleracion);
					//System.out.println("Tu velocidad es de " + this.getVelocidad() + " km/h");
				}
				if (this.kilometrosRecorridos >= this.distanciaCarrera) {
					System.out.println("Has terminado la carrera.");
					this.estadoCoche = "TERMINADO";
				}
			}
		}
	}

	public void frenar() {

		if ((this.getEstadoCoche().equalsIgnoreCase("Parado")) || (this.getEstadoCoche().equals("Accidentado"))) {
			System.out.println("Para frenar primero tienes que arrancar el coche.");
		} else {
			if (this.getEstadoCoche().equalsIgnoreCase("Marcha")) {
				double r = Math.random() * this.POTENCIA + 1;
				int frenada = (int) Math.floor(r);
				int velocidad = this.getVelocidad();
				int kms = this.getKilometrosRecorridos();

				velocidad -= frenada;

				if (velocidad < 0) {
					this.setVelocidad(0);
				} else {
					this.setVelocidad(velocidad);
					this.setKilometrosRecorridos(kms + frenada);
				}
				if (this.kilometrosRecorridos >= this.distanciaCarrera) {
					this.estadoCoche = "Terminado";
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Coche [nombrePiloto=" + nombrePiloto + ", dorsal=" + dorsal + ", estadoCoche=" + estadoCoche
				+ ", velocidad=" + velocidad + ", kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	
}