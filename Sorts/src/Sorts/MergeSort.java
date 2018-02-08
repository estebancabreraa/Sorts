/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

/**
 *
 * @author Revilo
 */

public class MergeSort {
	
	static void mergeCall(Comparable[] arreglo){
		int size = arreglo.length;
		if(size> 1){
			if(size % 2 == 0){
                                Comparable[] izq = new Comparable[size/2];
				Comparable[] der = new Comparable[size/2];
				depurador(arreglo, izq, 0, size/2);
				depurador(arreglo, der, size/2, size);
                                
				mergeCall(izq);
				mergeCall(der);
				mezclador(arreglo, izq, der);
			}else {
				Comparable[] izq = new Comparable[size/2];
				Comparable[] der = new Comparable[(size/2) + 1];
				depurador(arreglo, izq, 0, size/2);
				depurador(arreglo, der, size/2 + 1, size);
				mergeCall(izq);
				mergeCall(der);
				mezclador(arreglo, izq, der);
			}
		}
		
	}
	
	static void depurador(Comparable[] arreglo, Comparable[] arreglo2, int inicio, int fin){
		int contador = 0;
		for(int i=inicio; i<fin; i++){
			arreglo2[contador] = arreglo[i];
			contador++;
		}
			
	}
	
	static void mezclador(Comparable[] arreglo, Comparable[] izq, Comparable[] der){
		int contadorIzq = 0;
		int contadorDer = 0;
		int contadorArr = 0;
		
		while(contadorArr < arreglo.length){
			if(contadorIzq >= izq.length){
				arreglo[contadorArr] = der[contadorDer];
				contadorDer++;
			}
			else if(contadorDer >= der.length){
				arreglo[contadorArr] = izq[contadorIzq];
				contadorIzq++;
			}
			else if(izq[contadorIzq].compareTo(der[contadorDer]) > 0){
				arreglo[contadorArr] = der[contadorDer];
				contadorDer++;
			}
			else{
				arreglo[contadorArr] = izq[contadorIzq];
				contadorIzq++;
			}
			contadorArr++;
		}
	}

}


