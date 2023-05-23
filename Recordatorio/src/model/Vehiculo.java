package model;

public class Vehiculo {
	private float peso;
	private String nombre;
	private String descripcion;
	private Posicion ubicacion;
	private Dimension dimensiones;
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
		this.ubicacion= new Posicion();
		this.dimensiones= new Dimension();
	}

	public Vehiculo(float peso, String nombre, String descripcion, Posicion ubicacion, Dimension dimensiones) {
		this.peso = peso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
		this.dimensiones = dimensiones;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Posicion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Posicion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Dimension getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimension dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Vehiculo [peso=" + peso + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ubicacion="
				+ ubicacion + ", dimensiones=" + dimensiones + "]";
	}
	
}
