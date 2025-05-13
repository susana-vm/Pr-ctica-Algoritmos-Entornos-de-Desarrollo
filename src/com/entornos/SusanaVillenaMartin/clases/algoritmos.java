package com.entornos.SusanaVillenaMartin.clases;

/**
 * Clase para 
 * @author Susana
 */

public class algoritmos {
	
	/**
	 * Calcula el numero fibonacci del numero pasado por parametro
	 * @param numero que se le pasa por parametro
	 * @return int
	 */
	public int fibonacci (int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException("El numero debe ser mayor a 0");
		}else {
			int n1=0 , n2=1;
			for(int i=2; i <= numero; i++ ) {
				int n3 = n1 + n2;
				n1 = n2;
				n2= n3;	
			}
			return n1;		
		}	
	}

}
