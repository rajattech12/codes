import java.util.*;
public class misingInArray8 {
	public static int MissingNumber(int [] arr ){
	     int n = arr.length +1;
	     
	     int i =0;
	     while(i<arr.length){
	         if(arr[i] == i+1 || arr[i] == n)
	         i++;
	         else{
	             int idx = arr[i] -1;
	             swap(arr,idx ,i);
	             }
	         }
	         for(i =0; i<arr.length; i++){
	             if( arr[i] != i+1) return i+1;
	             }
	             return n;
	    }
	    public static void swap(int [] arr , int idx , int i){
	        int temp  = arr[i];
	        arr[i] = arr[idx];
	        arr[idx] = temp; 
	        }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<=arr.length-1; i++){
		    System.out.print("Enter " +(i+1)+  " Element of array : "); 
		    arr[i] = sc.nextInt();
		}
		int ans  = MissingNumber(arr);
		System.out.print("MissingNumber : " +ans);
	}
}