package view;

import model.Dimension;
import model.Posicion;
import model.Vehiculo;
import model.enums.MarcasCoches;
import model.exception.DataOutOfBoundsException;

public interface InterfazVehiculo<T extends Vehiculo> {
	
	/*---------------------------DATOS PERTENECIENTES A VEHICULO-------------------------------*/
	public default void setPeso(float peso, T vehiculo) {
		vehiculo.setPeso(peso);
	}
	
	public default void setNombre(String nombre, T vehiculo) {
		vehiculo.setNombre(nombre);
	}
	
	public default void setDescripcion(String descripcion, T vehiculo) {
		vehiculo.setDescripcion(descripcion);
	}
	
	public default void setUbicacion(Posicion ubicacion, T vehiculo) {
		vehiculo.setUbicacion(ubicacion);
	}
	
	public default void setDimensiones(Dimension dimensiones, T vehiculo) {
		vehiculo.setDimensiones(dimensiones);
	}
	
	public default float getPeso(T vehiculo) {
		return vehiculo.getPeso();
	}
	
	public default String getNombre(T vehiculo) {
		return vehiculo.getNombre();
	}
	
	public default String getDescripcion(T vehiculo) {
		return vehiculo.getDescripcion();
	}
	
	public default Posicion getUbicacion(T vehiculo) {
		return vehiculo.getUbicacion();
	}
	
	public default Dimension getDimensiones(T vehiculo) {
		return vehiculo.getDimensiones();
	}
	/*-------------------------./DATOS PERTENECIENTES A VEHICULO-------------------------------*/
	
	public void setNruedas(int nruedas, T vehiculo) throws DataOutOfBoundsException;
	public void setNpuertas(int npuertas, T vehiculo) throws DataOutOfBoundsException;
	public void setMarcas(MarcasCoches MARCAS, T vehiculo);
	public void setModelo(String modelo, T vehiculo);
	
	public int getNruedas(T vehiculo);
	public int getNpuertas(T vehiculo);
	public MarcasCoches getMarcas(T vehiculo);
	public String getModelo(T vehiculo);
}
