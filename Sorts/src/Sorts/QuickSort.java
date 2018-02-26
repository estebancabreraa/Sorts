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

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


public class QuickSort {
	
	public static void main(String[] args){
            QuickSort app = new QuickSort();
            
            int[] input = app.generateRandomNumbers(3000);
            
            System.out.println("QUICK SORT");
            System.out.println("");
            
            System.out.println("Sort Inicial");
            System.out.println(Arrays.toString(input));
            
            System.out.println(" ");
            System.out.println("Sort final");
            System.out.println(Arrays.toString(app.QuickSort(input)));
            
        }
	
	
	public int [] QuickSort(int numeros[]){
		return quicksort2(numeros,0,numeros.length-1);
	}
	
	public int[] quicksort2(int numeros[],int izq, int der){
		if(izq>=der)
			return numeros;
		int i=izq,d=der;
		if(izq!=der){
			int pivote;
			int aux;
			pivote=izq;
			while (izq!=der){
				while (numeros[der]>=numeros[pivote] && izq<der)
					der--;
				while(numeros[izq]<numeros[pivote] && izq<der)
					izq++;
				if(der!=izq)
				{
					aux = numeros[der];
					numeros[der]=numeros[izq];
					numeros[izq]=aux;
				}
				if(izq==der){
					quicksort2(numeros,i,izq-1);
					quicksort2(numeros,izq+1,d);
				}
			}	
					
		}
		else
			return numeros;
		return numeros;
	}
         private int[] generateRandomNumbers(int n){
            StringBuffer cadena = new StringBuffer();
            int[] result = new int[n];
            Random random = new Random();
        try{
            FileWriter fw = new FileWriter("ArchivoGenerado");
            for(int i = 0; i < result.length; i++){
                result[i] = random.nextInt(n*10);
            }
            for (int j = 0; j < result.length; j++){
                cadena = cadena.append(result[j]);
            }
            fw.write(cadena.toString());
            fw.close();
        }catch(IOException e){
            System.out.println("Error e/s: " + e);
        }  
            return result;
        }
				
}


