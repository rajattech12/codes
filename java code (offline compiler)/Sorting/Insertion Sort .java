import java.util.Scanner;
public class InsertionSort {
	public static void intsertionSort(int[] a){
	    for(int i=0; i<a.length; i++){
	         int j=i;
	         while(j>0 && a[j]<a[j-1]){
	             int temp = a[j];
	             a[j] = a[j-1];
	             a[j-1] = temp;
	           j--;  
	    }
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		 for(int i=0; i<arr.length; i++){
		     System.out.print("Enter "+(i+1)+" Element of Array : ");
		     arr[i] = sc.nextInt();
		     }
	    for(int i =0; i<arr.length; i++){
	        System.out.print(arr[i]+" ");        	        
	    }
	    System.out.println(" ");
	intsertionSort(arr);
	for(int i=0; i<arr.length; i++){
	    System.out.print(arr[i]+" ");
	    
	}	
	}
}