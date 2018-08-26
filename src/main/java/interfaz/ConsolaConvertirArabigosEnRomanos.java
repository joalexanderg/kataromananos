package interfaz;

import java.util.Scanner;

import dominio.Romano;
import dominio.ServiciosConversionArabigosARomanos;

public class ConsolaConvertirArabigosEnRomanos {
	public static void main(String[] args) {
		
		ServiciosConversionArabigosARomanos serviciosConversionArabigosARomano = Romano.crearRomano();
		String romano = "";
		int arabigo = 0;
		boolean control = true;
		System.out.println ("=======================================");
		System.out.println ("=======================================");
		System.out.println ("CONVERTIR ARABIGOS A ROMANOS");
		System.out.println ("RANGO 1-3999");
		System.out.println ("=======================================");
		System.out.println ("=======================================");
        
        String entradaTeclado = "";
        Scanner entradaEscaner ;
        
        while(control){
        	System.out.println ("Por favor introduzca el numero arabigo por teclado que desea convertir:");
        	entradaEscaner = new Scanner (System.in); 
        	entradaTeclado = entradaEscaner.nextLine (); 
        	if(!entradaTeclado.isEmpty()){
	        	if(entradaTeclado.equals("exit")){
	        		control = false;
	        	}
	        	else if(serviciosConversionArabigosARomano.esNumeroArabigo(entradaTeclado)){
	        		arabigo = Integer.parseInt(entradaTeclado);
	                romano = serviciosConversionArabigosARomano.convertirArabigosEnRomanos(arabigo);
	                System.out.println ("Entrada recibida por teclado es: " + entradaTeclado +"\n" + "Romano: " + romano+"\n");
	                System.out.println ("=======================================");
	        	}
	        	else{
	        		System.out.println ("El valor ingresado no es arabigo" +"\n");
	        	} 
        	}
        	else{
        		System.out.println ("No ha ingresado ningun dato" +"\n");
        	}
        }
        System.exit(0);
	}
}
