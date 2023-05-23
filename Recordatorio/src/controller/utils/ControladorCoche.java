package controller.utils;

import model.Coche;
import model.Dimension;
import model.Posicion;
import model.enums.MarcasCoches;
import model.exception.DataOutOfBoundsException;
import model.exception.RequirementsNotMatchesException;
import view.InterfazVehiculo;

public class ControladorCoche implements InterfazVehiculo<Coche> {

	@Override
	public void setNruedas(int nruedas, Coche obj) throws DataOutOfBoundsException {
		// TODO Auto-generated method stub
		obj.setNruedas(nruedas);
	}

	@Override
	public void setNpuertas(int npuertas, Coche obj) throws DataOutOfBoundsException {
		// TODO Auto-generated method stub
		obj.setNpuertas(npuertas);
	}

	@Override
	public void setMarcas(MarcasCoches MARCAS, Coche obj) {
		// TODO Auto-generated method stub
		obj.setMarcas(MARCAS);
	}

	@Override
	public void setModelo(String modelo, Coche obj) {
		// TODO Auto-generated method stub
		try {
			obj.setModelo(modelo);
		} catch (RequirementsNotMatchesException | DataOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int getNruedas(Coche obj) {
		// TODO Auto-generated method stub
		return obj.getNruedas();
	}

	@Override
	public int getNpuertas(Coche obj) {
		// TODO Auto-generated method stub
		return obj.getNpuertas();
	}

	@Override
	public MarcasCoches getMarcas(Coche obj) {
		// TODO Auto-generated method stub
		return obj.getMarcas();
	}

	@Override
	public String getModelo(Coche obj) {
		// TODO Auto-generated method stub
		return obj.getModelo();
	}
	
	//-------CAST (CONVERTIR) UN OBJETO A OTRO (VALIDACIÓN)
	private Coche castToCoche(Object obj) throws Exception {
		if(!(obj instanceof Coche)) {
			throw new Exception();
		}
		// --->Otra forma de castear//
		//Coche.class.cast(obj);
		return (Coche) obj;
	}


}
