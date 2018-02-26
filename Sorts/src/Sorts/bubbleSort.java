/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Revilo
 */
public class bubbleSort {
    
            public static void main(String[] args){
            bubbleSort app = new bubbleSort();
            
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            
            System.out.println("Enter a number: ");
            int n = reader.nextInt();
            
            int[] input = app.generateRandomNumbers(n);
                        
            System.out.println("BUBBLE SORT");
            System.out.println("");
            
            System.out.println("Sort Inicial");
            System.out.println(Arrays.toString(input));
            
            System.out.println(" ");
            System.out.println("Sort final");
            System.out.println(Arrays.toString(app.bubbleSort(input)));
            
        }
    
    public int[] bubbleSort(int[] nums){
            int aux;
            for (int i = 1; i < nums.length - 1; i++){
                for (int o = i + 1; o < nums.length;  o++){
                    if (nums[o] < nums[i]){
                        aux = nums[i];
                        nums[i] = nums[o];
                        nums[o] = aux;
                    }
                }
            }
            return nums;
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
    

