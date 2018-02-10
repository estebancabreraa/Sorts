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
public class RadixSort {
    
    public int[] radixSort(Comparable[] cant, int ...numeros){
		for(int i=1; i<6;i++){
			Integer posiciones[][]= new Integer[10][30000];
			Integer CantNum[]= new Integer[10];
			for(int o=0;o<10;o++){
				CantNum[o]=0;
			}
			for(int o=0; o<cant.length;o++){
				int entero=(int) ((int)(numeros[o] % Math.pow(10, i) - numeros[o] % Math.pow(10, i-1))  /Math.pow(10, i-1));
				posiciones[entero][CantNum[entero]]=numeros[o];
				CantNum[entero]=CantNum[entero]+1;
				
			}
                        
			
			int x=0;
			for(int o=0; o<10;o++){				
				for(int u=0;u<30000;u++){
					if(posiciones[o][u]!=null){
						numeros[x]=posiciones[o][u];
						x++;
					}else{
						u=30000;
					}
				}
			}
			
		}
		return numeros;
	}
    
}
