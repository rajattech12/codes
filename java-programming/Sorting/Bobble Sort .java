import java.util.Scanner;
public class BobbleSort {
	public static void Bubblesort(int[] a){
	    for(int i = 0; i<a.length-1; i++){
	        for(int j=0; j<a.length-(i+1); j++){
	           if(a[j]>a[j+1]){
	             int temp = a[j];
	            a[j] = a[j+1];
	            a[j+1] = temp;
	           }
	            }
	        }
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		 for(int i=0; i<arr.length; i++){
		     System.out.print("Enter "+(i+1)+"Element of Array : ");
		     arr[i] = sc.nextInt();
		     }
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		    }
		    System.out.println(" ");
		    
	  Bubblesort(arr);
	  for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i] +" ");
		    }
	  
	}
}