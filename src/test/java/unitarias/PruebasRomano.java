package unitarias;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import dominio.Romano;
import utilidades.BaseRomano;

public class PruebasRomano {
	
	
	@Test
	public void pruebaConstruirUnidadDeMilEnRomanosFull(){
		//arrange
		int unidadesDeMil=0;
		String[] unidadDeMilEnRomanoEsperada = BaseRomano.ARREGLO_UNIDADES_DE_MIL;
		String[]unidadDeMilEnRomanoDevuelta = new String[3];		
		
		//act
		for(int i=0;i<unidadDeMilEnRomanoEsperada.length;i++)
		{
			unidadesDeMil = i+1;
			unidadDeMilEnRomanoDevuelta[i] = Romano.construirUnidadDeMilEnRomanos(unidadesDeMil);
		}	
			
		//assert
		//assertEquals(numeroRomanoEsperado,numeroRomanoDevuelto);
		
		assertArrayEquals(unidadDeMilEnRomanoEsperada, unidadDeMilEnRomanoDevuelta);
	}
	
	@Test
	public void pruebaConstruirCentenasEnRomanosFull(){
		//arrange
		int centenas=0;
		
		//String[] centenasEnRomanoEsperada = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] centenasEnRomanoEsperada = BaseRomano.ARREGLO_CENTENAS;
		String[]centenasDevuelta = new String[9];		
		
		//act
		for(int i=0;i<centenasEnRomanoEsperada.length;i++){
			centenas = i+1;
			centenasDevuelta[i] = Romano.construirCentenasEnRomanos(centenas);
		}
	
		//assert
		assertArrayEquals(centenasEnRomanoEsperada, centenasDevuelta);
	}
	
	@Test
	public void pruebaConstruirDecenasEnRomanosFull(){
		//arrange
		int decenas=0;
		String[] decenasEnRomanoEsperada = BaseRomano.ARREGLO_DECENAS;
		String[] decenasEnRomanoDevuelta = new String[9];		
		
		//act
		for(int i =0; i<decenasEnRomanoEsperada.length;i++){
			decenas= decenas+1;
			decenasEnRomanoDevuelta[i] = Romano.construirDecenasEnRomanos(decenas);
		}
		
		//assert
		assertArrayEquals(decenasEnRomanoEsperada,decenasEnRomanoDevuelta);
	}
	
	@Test
	public void pruebasConstruirUnidadesEnRomanosFull(){
		//arrange
		int unidades=0;
		String[] unidadesEnRomanoEsperada = BaseRomano.ARREGLO_UNIDADES;
		String[] unidadesEnRomanoDevuelta = new String[9];		
		
		//act
		for(int i=0; i<unidadesEnRomanoEsperada.length;i++){
			unidades = i+1;
			unidadesEnRomanoDevuelta[i] = Romano.construirUnidadesEnRomanos(unidades);
		}
		//assert
		
		assertArrayEquals(unidadesEnRomanoEsperada,unidadesEnRomanoDevuelta);
	
	}
}
