import java.util.Scanner;
public class SwapTwoArray {
	public static void swap(int[] a, int[] b){
	     int i=0,j=0;
	     while (i<a.length){
	     int temp = a[i];
	    a[i] = b[j];
	    b[j] = temp;
	    i++;
	    j++;
	     }
	}
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter Array size : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int m=1;
		for(int i =0; i< a.length; i++){
		    System.out.print("Enter " +m+ "Element of Array A : ");
		    a[i] = sc.nextInt();
		    m++;
		    }
		    
		int[] b = new int[n];
		int t=1;
		for(int i =0; i< b.length; i++){
		    System.out.print("Enter " +t+ "Element of Array B : ");
		    b[i] = sc.nextInt();
		    m++;
		    }
		    swap(a,b);
		    System.out.println("After Swapping:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}