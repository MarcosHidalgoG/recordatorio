package view;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import controller.utils.ControladorCoche;
import model.*;
import model.enums.MarcasCoches;
import model.exception.DataOutOfBoundsException;
import model.exception.RequirementsNotMatchesException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche mycarro;
		try {
			mycarro = generateCar();
			System.out.println(mycarro);
			ControladorCoche conCoche = new ControladorCoche();
			conCoche.setPeso(334.33f, mycarro);
			System.out.println("MODIFICADO: "+ mycarro);
			ObjectMapper json = new ObjectMapper() {{
				configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
			}};
			try {
				System.out.println(json.writerWithDefaultPrettyPrinter().writeValueAsString(mycarro));
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (DataOutOfBoundsException | RequirementsNotMatchesException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		} 
		System.out.println("Finalización");
	}
	
	private static Coche generateCar() throws DataOutOfBoundsException, RequirementsNotMatchesException {
		return new Coche() {{
			setDescripcion("Coche de 4 ruedas super deportivo");
			setMarcas(MarcasCoches.Ford);
			setModelo("Focus");
			setDimensiones(new Dimension() {{
				setAltura(2.01f);
				setAnchura(3.04f);
				setLongitud(5.3f);
			}});
			setNmatricula("0194-DZN");
			setNpuertas(3);
			setNruedas(2);
			setNombre("KOCAS");
			setPeso(333.33f);
			setUbicacion(new Posicion() {{
				setAltitud(3333.3f);
				setCoor(new Coordenadas() {{
					setLatitud(5464.4f);
					setLongitud(3655.85f);
				}});
			}});
		}};
	}

}