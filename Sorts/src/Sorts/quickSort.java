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

/**
 *
 * @author Revilo
 */
public class quickSort {
    
 
    
            public static void main(String[] args){
            quickSort app = new quickSort();
            
            int[] input = app.generateRandomNumbers(3000);
            
            System.out.println("GNOME SORT");
            System.out.println("");
            
            System.out.println("Sort Inicial");
            System.out.println(Arrays.toString(input));
            
            System.out.println(" ");
            System.out.println("Sort final");
            System.out.println(Arrays.toString(app.quickSort(input)));
            
        }
    
    public int[] quickSort(int[] nums, int li, int lf){
            int element;
            int[] l1 = null, l2 = null;
            int t1 = 0, t2 = 0;
            if (lf > li){
                element = nums[li];
                for (int i = li + 1; i <= lf; i++){
                    if (nums[i] < element){
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
