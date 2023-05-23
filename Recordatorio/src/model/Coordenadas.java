package model;

public class Coordenadas {
	private float latitud, longitud;
	
	public Coordenadas() {
		// TODO Auto-generated constructor stub
	}

	public Coordenadas(float latitud, float longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Coordenadas [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
}
