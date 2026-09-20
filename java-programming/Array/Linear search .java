import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int m = 1;
		for(int i=0; i<arr.length; i++){
		    System.out.print("Enter  " +m+ " Element of Array : ");
		    arr[i] = sc.nextInt();
		    m++;
		    }
		   boolean flag = false;
	       System.out.print("Enter Target element : ");
	       int target = sc.nextInt();
	       for(int i=0; i<arr.length; i++){
	           if(arr[i] == target){
	            flag = true;   
	           break;
	           }
	           }
	           
	           if(flag == true)
	           System.out.print("Mil Gaya");
	           else
	           System.out.print("Nahi MIla");
	}
}