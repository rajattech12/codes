import java.util.Scanner;
public class ArrayReverse {
	public static void Reverse(int[] a){
	    int i=0, j=a.length-1;
	    while(i<j){
	    int temp = a[i];
	         a[i] = a[j];
	         a[j] = temp;
	         i++;
	         j--;
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int c = 1 ;
		for( int i=0; i<arr.length; i++){
		    System.out.print("Enter "+c+" Element of Array : ");
		    arr[i] = sc.nextInt();
		     c++;
		        }
	   for(int i=0; i<arr.length; i++){
	         System.out.print(arr[i]+" ");
	       }
	       System.out.println(" ");
	       Reverse(arr);
	   for(int i=0; i<arr.length; i++)
	        System.out.print(arr[i]+" ");
	}
}