import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int m = 1;
		for(int i=0; i<arr.length; i++){
		    System.out.print("Enter " +m+ " Elemente of Array : ");
		    arr[i] = sc.nextInt();
		    }
		    int max = arr[0];
		    for(int i=0; i<arr.length; i++){
		        if(arr[i]>max)
		         max = arr[i]; 
		        }
		        int smax = Integer.MIN_VALUE;
		        for(int i=0; i<arr.length; i++){
		            if(arr[i] > smax && arr[i] !=max)
		            smax = arr[i];
		            }
		System.out.print("Largest element in the Array : "+max);
		System.out.print("Second Largest element in the Array : "+smax);
	}
}
		