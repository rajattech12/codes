import java.util.Scanner;
public class PushZeroTpush {
	public static void PushZeroTpush(int[] arr){
	    for(int i=0; i<arr.length-1; i++){
	        for(int j=0; j<arr.length-(i+1); j++ ){
	            if(arr[j] == 0){
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	                }
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
	for(int i=0; i<arr.length; i++){
	    System.out.print(arr[i]+" ");
	    }
	    System.out.println(" ");
	 PushZeroTpush(arr);
	 for(int i=0; i<arr.length; i++){
	    System.out.print(arr[i]+" ");
	    }
	}
}