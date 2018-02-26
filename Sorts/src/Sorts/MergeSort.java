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
public class MergeSort {
    private int[] numbers;
    private int[] helper;

    private int number;
    
    
    public static void main(String[] args){
            MergeSort app = new MergeSort();
            
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            
            System.out.println("Enter a number: ");
            int n = reader.nextInt();
            
            int[] input = app.generateRandomNumbers(n);
            
            System.out.println("MERGE SORT");
            System.out.println("");
            
            System.out.println("Sort Inicial");
            System.out.println(Arrays.toString(input));
            
            System.out.println(" ");
            System.out.println("Sort final");
            System.out.println(Arrays.toString(app.sort(input)));
            
        }

    public int[] sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        return mergesort(0, number - 1);
    }

    private int[] mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            return merge(low, middle, high);
        }
        return null;
    }

    private int[] merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
        return numbers;

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
