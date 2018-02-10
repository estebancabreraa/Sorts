/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static Sorts sorts = new Sorts();
    public static Comparable[] aOrdenar = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de elementos del arreglo:");
        String cantidad = sc.nextLine();
       
      
        System.out.println("Seleccione el sort para ordenar:");
        System.out.println("1. Gnome");
        System.out.println("2. Merge sort");
        System.out.println("3. Quick sort");
        System.out.println("4. Radix");
        System.out.println("5. Bubble");
        
        String nSort = sc.nextLine();
        switch (nSort){
            case "1":
                    sorts.gnomeSort(aOrdenar);
                break;
            case "2":
                    
                break;
            case "3":
                    sorts.quickSort(aOrdenar, 1, aOrdenar.length);
                break;
            case "4":
                    sorts.radixSort(aOrdenar, aOrdenar.length);
                break;
            case "5":
                    sorts.bubbleSort(aOrdenar);
                break;
                
        }
    }
    
}
