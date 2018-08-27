package integracion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Romano;
import utilidades.BaseRomano;

public class PruebasRomano {
	@Test
	public void pruebaConvertirArabigosEnRomanosUnidadesdeMil(){
		//arrange
		int numeroArabigo=3999;
		String numeroRomanoEsperado = "MMMCMXCIX";
		String numeroRomanoDevuelto = "";
		Romano romano = Romano.crearRomano();
		//act
		numeroRomanoDevuelto = romano.convertirArabigo(numeroArabigo);
		//assert
		assertEquals(numeroRomanoEsperado,numeroRomanoDevuelto);
	}
	
	@Test
	public void pruebaConvertirArabigosEnRomanosCentenas(){
		//arrange
		int numeroArabigo=999;
		String numeroRomanoEsperado = "CMXCIX";
		String numeroRomanoDevuelto = "";
		Romano romano = Romano.crearRomano();
		//act
		numeroRomanoDevuelto = romano.convertirArabigo(numeroArabigo);
		//assert
		assertEquals(numeroRomanoEsperado,numeroRomanoDevuelto);
	}
	
	@Test
	public void pruebaConvertirArabigosEnRomanosDecenas(){
		//arrange
		int numeroArabigo=58;
		String numeroRomanoEsperado = "LVIII";
		String numeroRomanoDevuelto = "";
		Romano romano = Romano.crearRomano();
		//act
		numeroRomanoDevuelto = romano.convertirArabigo(numeroArabigo);
		//assert
		assertEquals(numeroRomanoEsperado,numeroRomanoDevuelto);
	}
	
	@Test
	public void pruebaConvertirArabigosEnRomanosUnidades(){
		//arrange
		int numeroArabigo=7;
		String numeroRomanoEsperado = "VII";
		String numeroRomanoDevuelto = "";	
		Romano romano = Romano.crearRomano();
		//act
		numeroRomanoDevuelto = romano.convertirArabigo(numeroArabigo);
		//assert
		assertEquals(numeroRomanoEsperado,numeroRomanoDevuelto);
	}
	
	@Test
	public void pruebaConvertirArabigosEnRomanosFueraDeRango(){
		//arrange
		int numeroArabigo=0;
		String numeroRomanoEsperado = BaseRomano.MENSAJE_ERROR_FUERA_DE_RANGO;
		String numeroRomanoDevuelto = "";	
		Romano romano = Romano.crearRomano();
		//act
		numeroRomanoDevuelto = romano.convertirArabigo(numeroArabigo);
		//assert
		assertEquals(numeroRomanoEsperado,numeroRomanoDevuelto);
	}
}
