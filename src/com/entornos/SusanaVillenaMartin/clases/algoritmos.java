package com.entornos.SusanaVillenaMartin.clases;

/**
 * Clase para 
 * @author Susana
 */

public abstract class algoritmos {
	
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
	
	/**
	 * Calcula el factorial del numero pasado por parametro
	 * @param numero pasado por parametro
	 * @return numero entero con factorial
	 */
	public int factorial(int numero) {
		if (numero <0) {
			throw new IllegalArgumentException("El nuemro debe se mayor a 0");
		}else {
			int resultado = 1;
			for(int i = 1; i<=numero; i++) {
				resultado *=1;
			}
			return resultado;
		}

	}
	
	/**
	 * Metodo para devovler true si el numero es primo y false si no lo es
	 * @param numero pasasdo por parametro
	 * @return si es primo o no 
	 */
	public boolean primo(int numero) {
	    if (numero < 2) {
	        throw new IllegalArgumentException("El número debe ser mayor o igual a 2");
	    }
	    if (numero == 2) {
	        return true; // El 2 es primo
	    }
	    if (numero % 2 == 0) {
	        return false; // Otros pares no lo son
	    }
	    for (int i = 3; i * i <= numero; i += 2) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}



}
