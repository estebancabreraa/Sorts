/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

/**
 *
 * @author esteb
 */
public class Sorts {
    
        public Comparable[] bubbleSort(Comparable[] nums){
            Comparable aux;
            for (int i = 1; i < nums.length - 1; i++){
                for (int o = i + 1; o < nums.length;  o++){
                    if (nums[o].compareTo(nums[i]) < 0){
                        aux = nums[i];
                        nums[i] = nums[o];
                        nums[o] = aux;
                    }
                }
            }
            return nums;
        }
        
        public Comparable[] quickSort(Comparable[] nums, int li, int lf){
            Comparable element;
            Comparable[] l1 = null, l2 = null;
            int t1 = 0, t2 = 0;
            if (lf > li){
                element = nums[li];
                for (int i = li + 1; i <= lf; i++){
                    if (nums[i].compareTo(element) < 0){
                        t1++;
                        l1[t1] = nums[i];
                    } else {
                        t2++;
                        l2[t2] = nums[i];
                    }
                }
                for (int o = 1; o <= t1; o++){
                    nums[li + o - 1] = l1[o];
                }
                nums[li + t1] = element;
                for (int u = 1; u <= t2; u++){
                    nums[li + t1 + u] = l2[u];
                }
                quickSort(nums, li, li + t1 - 1);
                quickSort(nums, li + t1 + 1, lf);
            }
            return nums;
        }
        
        /**
	 * Este Sort ordena los numeros del arreglo comparando pares y viendo cual es mayor.
	 * @param nums
	 * @return int []
	 */
	public Comparable[] gnomeSort(Comparable[] nums){ 
	    int index=1;
	    int n = nums.length;
	    Comparable temp;
	    while(index<n){ 
	    	
	    	if(nums[index].compareTo(nums[index-1]) < 0){ 
		    temp=nums[index];
		    nums[index]=nums[index-1];
		    nums[index-1]=temp;
		    index--; 
		    if(index==0){ 
		        index=1;
		    }
		}
		else{
		    index++; 
		}
            }
	    return(nums);
	}
        
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
