/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


/**
 *
 * @author Revilo
 */
public class mergeCall {
    
    
    
    public void mergeCall(Comparable[] arreglo){
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
        private int[] mergeSort(int[] input){
            
            if(input.lenght == 1){
            return input;
            }
            
            int middle = (int) Math.ceil((double) input.lenght / 2);
            int[] left = new int(middel);
            
            int rightLength = 0;
            if(input.length % 2 == 0){
                rightLength = middle;
            }
            else{
                righLength = middle - 1;
            }
            int[] right = new int[rightLength];
            int leftIndex = 0;
            int rightIndex = 0;
            
            for(int i = 0; i < input.length; i++){
                if (i<middle){
                    left[leftIndex] = input[i];
                    leftIndex++;
                }
                else{
                    righ[righIndex] = input[i];
                    rightIndex++;
                }
            }
            
        }
        
        
        
    
}
