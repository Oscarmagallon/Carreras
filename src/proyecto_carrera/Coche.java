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
	private final int POTENCIA = 50;

	public Coche(String nombrePiloto, int dorsal) {
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.distanciaCarrera = 7500;
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
		return;
	}

public void acelerar() {
		
		if ((this.getEstadoCoche().equalsIgnoreCase("Parado"))||(this.getEstadoCoche().equals("Accidentado"))) {
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
					this.setKilometrosRecorridos(kilometros+velocidad);
					System.out.println("Tu velocidad es de " + this.getVelocidad() + " km/h");
				}
				if (this.kilometrosRecorridos >= this.distanciaCarrera) {
					System.out.println("Has terminado la carrera.");
				}else {
					System.out.println("Te faltan " + (this.getDistanciaCarrera()- this.getKilometrosRecorridos()) + " kms para terminar la carrera.");
					return;
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
					this.setEstadoCoche("Estas parado.");
					System.out.println("Tu velocidad es de " + this.getVelocidad());
				} else {
					this.setVelocidad(velocidad);
					this.setKilometrosRecorridos(kms + velocidad);
					System.out.println("Vas a " + this.getVelocidad() + " km/h");
				}
				if (this.kilometrosRecorridos >= this.distanciaCarrera) {
					System.out.println("Has terminado la carrera.");
				} else {
					System.out.println("Faltan " + (this.getDistanciaCarrera() - this.kilometrosRecorridos)
							+ " kms para terminar la carrera.");
					return;
				}
			}
		}
	}
}