package model;

public class Dimension {
	private float altura, anchura, longitud;

	public Dimension() {
		// TODO Auto-generated constructor stub
	}

	public Dimension(float altura, float anchura, float longitud) {
		this.altura = altura;
		this.anchura = anchura;
		this.longitud = longitud;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Dimension [altura=" + altura + ", anchura=" + anchura + ", longitud=" + longitud + "]";
	}
	
	
	
}
