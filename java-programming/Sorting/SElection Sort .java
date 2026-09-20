import java.util.Scanner;
public class SelectionSort {
	public static void SelectionSort(int[] a){
	    for(int i=0; i<a.length; i++){
	        int min = Integer.MAX_VALUE;
	        int idxmin = -1;
	        for( int j=i; j<a.length; j++){
	            if(a[j]<min){
	                min = a[j];
	                idxmin = j;
	                }
	            }
	            int temp = a[i];
	            a[i] = a[idxmin];
	            a[idxmin] = temp;
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
		    for(int i=0; i<arr.length; i++){
		        System.out.print(arr[i]+" "); 
		    }
		    System.out.println(" ");
		    SelectionSort(arr);
		    for(int i=0; i<arr.length; i++){
		        System.out.print(arr[i]+" ");
		        }
	}
}