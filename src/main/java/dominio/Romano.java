package dominio;

import utilidades.BaseRomano;

public class  Romano implements ConversionArabigo{
	
	
	public Romano() {
		super();
	}

	public String convertirArabigo(int numeroArabigo) {
		String numeroRomanoCreado = "";
		boolean control = true;
		
		if(numeroArabigo > 0 && numeroArabigo < 4000 ){
			int resultadoDivisionEntera;
				
			while (control){
				if(numeroArabigo >= 1000 && numeroArabigo < 4000){
					resultadoDivisionEntera = numeroArabigo/1000;
					numeroRomanoCreado = Romano.construirUnidadDeMilEnRomanos(resultadoDivisionEntera);
					numeroArabigo = numeroArabigo%1000;
				}
				else if(numeroArabigo >= 100 && numeroArabigo < 1000){
					resultadoDivisionEntera = numeroArabigo/100;
					numeroRomanoCreado = numeroRomanoCreado + Romano.construirCentenasEnRomanos(resultadoDivisionEntera);
					numeroArabigo = numeroArabigo%100;
				}
				else if(numeroArabigo >= 10 && numeroArabigo < 100){
					resultadoDivisionEntera = numeroArabigo/10;
					numeroRomanoCreado = numeroRomanoCreado + Romano.construirDecenasEnRomanos(resultadoDivisionEntera);
					numeroArabigo = numeroArabigo%10;
				}
				else if(numeroArabigo >0 && numeroArabigo < 10){
					numeroRomanoCreado = numeroRomanoCreado + Romano.construirUnidadesEnRomanos(numeroArabigo);
					numeroArabigo = numeroArabigo%1;
				}
				else {
					control = false;
				}
			}
		}
		else{
		    return BaseRomano.MENSAJE_ERROR_FUERA_DE_RANGO;
		}
			
	    return numeroRomanoCreado;
	}
	
	public static String construirUnidadesEnRomanos(int numeroArabigo){
		String unidadesRomanas = "";
		
		switch (numeroArabigo){
		
		case 1: 
			unidadesRomanas = "I";
		    break; 
		        
		case 2: 
			unidadesRomanas = "II";
			break; 
        
		case 3: 
			unidadesRomanas = "III";
			break; 
		
		case 4: 
			unidadesRomanas = "IV";
		    break; 	
		case 5: 
			unidadesRomanas = "V";
		    break; 	
		case 6: 
			unidadesRomanas = "VI";
		    break; 	
		case 7: 
			unidadesRomanas = "VII";
			break; 	
		case 8: 
			unidadesRomanas = "VIII";
			break;	
		
		case 9: 
			unidadesRomanas = "IX";
			break;		
				
		}
		return unidadesRomanas;
	}
	
	public static String construirDecenasEnRomanos(int numeroArabigo){
		String decenasRomanas = "";
		
		switch (numeroArabigo){
		
		case 1: 
			decenasRomanas = "X";
		    break; 
		        
		case 2: 
			decenasRomanas = "XX";
			break; 
        
		case 3: 
			decenasRomanas = "XXX";
			break; 
		
		case 4: 
			decenasRomanas = "XL";
		    break; 	
		case 5: 
			decenasRomanas = "L";
		    break; 	
		case 6: 
			decenasRomanas = "LX";
		    break; 	
		case 7: 
			decenasRomanas = "LXX";
			break; 	
		case 8: 
			decenasRomanas = "LXXX";
			break;	
		
		case 9: 
			decenasRomanas = "XC";
			break;		
				
		}
		return decenasRomanas;
	}
	
	public static String construirCentenasEnRomanos(int numeroArabigo){
		String centenasRomanas = "";
		
		switch (numeroArabigo){
		
		case 1: 
			centenasRomanas = "C";
		    break; 
		        
		case 2: 
			centenasRomanas = "CC";
			break; 
        
		case 3: 
			centenasRomanas = "CCC";
			break; 
		
		case 4: 
			centenasRomanas = "CD";
		    break; 	
		case 5: 
			centenasRomanas = "D";
		    break; 	
		case 6: 
			centenasRomanas = "DC";
		    break; 	
		case 7: 
			centenasRomanas = "DCC";
			break; 	
		case 8: 
			centenasRomanas = "DCCC";
			break;	
		
		case 9: 
			centenasRomanas = "CM";
			break;		
				
		}
		return centenasRomanas;
	}
	
	public static String construirUnidadDeMilEnRomanos(int numeroArabigo) {
		String unidadDeMilRomana= "";
		
		switch(numeroArabigo){
		
		case 1:
			unidadDeMilRomana = "M";
			break;
			
		case 2:
			unidadDeMilRomana = "MM";
			break;
			
		case 3:
			unidadDeMilRomana = "MMM";
			break;
			
		default: unidadDeMilRomana	= BaseRomano.MENSAJE_ERROR_FUERA_DE_RANGO;
		}
		
		return unidadDeMilRomana;
	}
    
	public static Romano crearRomano(){
		return new Romano();
	}

	@Override
	public boolean esNumeroArabigo(String entradaConsola) {
		if (entradaConsola.matches("\\d*"))
			return true;
		else
			return false;
	}
	
}
