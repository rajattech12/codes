import java.util.Scanner;
public class SortingAnArray {
	public static void mergesort(int[] arr){
	    int n = arr.length;
	    if(n==1) return;
	    
	    int[] a = new int[n/2];
	    int[] b = new int[n-n/2];
	    
	    int  idx = 0;
	    for(int i=0; i<a.length; i++){
	        a[i] = arr[idx];
	        idx++;
	    }
	    for(int i=0; i<b.length; i++){
	        b[i] = arr[idx];
	        idx++;    
	        }
	    
	        mergesort(a);
	        mergesort(b);   
	        
	         merge(a,b,arr);
	}
	         
	      public static void merge(int[] a, int[] b, int[] c){
	       int i=0, j=0, k=0;
	       while(i< a.length && j<b.length){ 
	           if(a[i]<b[j]){
	               c[k]=a[i];
	               k++;
	               i++;
	               }
	           else{
	           c[k]=b[j];
	            k++;
	            j++;
	       }            
	       }  
	    while(i<a.length){
	    c[k]=a[i];
	    k++;
	    i++;
	    }
	    while(j<b.length){
	    c[k] = b[j];
	    k++;
	    j++;
	    }
	      }
	          
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Size of Array : ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter  "+n+"  Element");
	for(int i=0; i<n; i++){
	    arr[i] = sc.nextInt();
	    }
	     for(int i=0; i<n; i++){
	        System.out.print(arr[i]+" ");
	          }
	          System.out.println(" ");
	    mergesort(arr);   // <-- Missing line
	    for(int i=0; i<n; i++){
	        System.out.print(arr[i]+" ");
	         }    
	}
}