package com.entornos.SusanaVillenaMartin.clases;

public class Principal {

	public static void main(String[] args) {
		//Ejercico 1
		int numeros[]=new int [3];
		boolean repetido;
		do {
			repetido=false;
			for(int i = 0; i < numeros.length; i++) {
				numeros[i]=(int)(Math.random() * (10 - 2 + 1)) + 2;
			}
			if(numeros[0] == numeros[1]|| numeros[0]==numeros[2]||numeros[1]==numeros[2]) {
				repetido = true;
			}			
		}while(repetido);
		
		//Ejercicio 2
		algoritmos f = new algoritmos() {};
		int resultadoFibonacci[] = new int [3];
		for (int i=0; i < resultadoFibonacci.length; i++) {
			resultadoFibonacci[i]=f.fibonacci(numeros[i]);
		}
		
		//Ejercicio 3
		int resultadoFactorial[]= new int [3];
		for(int i=0; i < resultadoFactorial.length; i++) {
			resultadoFactorial[i]=f.factorial(numeros[i]);
		}
		
		//Ejercicio 4
		boolean resultadoPrimos[]= new boolean[3];
		for(int i=0; i<resultadoPrimos.length; i++) {
			resultadoPrimos[i]= f.primo(numeros[i]);
		}
	}

}
