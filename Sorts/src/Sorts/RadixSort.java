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
public class RadixSort {
    
    public static void main(String[] args){
            RadixSort app = new RadixSort();
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            
            System.out.println("Enter a number: ");
            int n = reader.nextInt();
            
            int[] input = app.generateRandomNumbers(n);
            
            System.out.println("RADIX SORT");
            System.out.println("");
            
            System.out.println("Sort Inicial");
            System.out.println(Arrays.toString(input));
            
            System.out.println(" ");
            System.out.println("Sort final");
            System.out.println(Arrays.toString(app.RadixSort(input)));
            
        }
    
     // The main function to that sorts arr[] of size n using
    // Radix Sort
    private int[] RadixSort(int arr[])
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, 3000);
 
        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, 3000, exp);
        return arr;
    }
    
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
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
