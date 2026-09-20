import java.util.Scanner;
public class ArraySortedOrNot {
	public static Boolean ArraySortedOrNot(int[] a){
	for(int i=0; i<a.length-1; i++){
	      if(a[i] > a[i+1]) return false;
	}
	return true;
	        }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Size of Array : ");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 
		 for(int i=0; i<arr.length; i++){
		     System.out.print("Enter "+(i+1)+" Element of Array :");
		     arr[i] = sc.nextInt();
		     }
	     Boolean ans = ArraySortedOrNot(arr);
	     
	    if(ans)
	    System.out.print("Array is Sorted");
	    else
	    System.out.print("Array is not sorted");
	}
}