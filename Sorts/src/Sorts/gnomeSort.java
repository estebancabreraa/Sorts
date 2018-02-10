
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
/**
 * @author Esteban Cabrera
 * @author Oliver mazariegos
 * Esta clase contiene el tipo de ordenamiento Gnome Sort que ordenara un arreglo de numeros
 */
public class gnomeSort {
	
        
        public static void main(String[] args){
            gnomeSort app = new gnomeSort();
            
            int[] input = app.generateRandomNumbers(3000);
            
            System.out.println("GNOME SORT");
            System.out.println("");
            
            System.out.println("Sort Inicial");
            System.out.println(Arrays.toString(input));
            
            System.out.println(" ");
            System.out.println("Sort final");
            System.out.println(Arrays.toString(app.gnomeSort(input)));
            
        }
	//Algoritmo extraido de: http://professorjava.weebly.com/gnome-sort.html
	
	/**
	 * Este Sort ordena los numeros del arreglo comparando pares y viendo cual es mayor.
	 * @param nums
	 * @return int []
	 */
	private int[] gnomeSort(int[] nums){ 
	    int index=1;
	    int n = nums.length;
	    int temp;
	    while(index<n){ 
	    	
	    	if(nums[index]<nums[index-1]){ 
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

