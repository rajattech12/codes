import java.util.*;
public class duplicateArray {
	public static ArrayList<Integer> DuplicateNumber(int[] arr){
	    ArrayList<Integer> list = new ArrayList<> ();
	    int n = arr.length; // 1 to n 
	    
	    int i =0;
	    while(i<n){
	        int rigthindex = arr[i] -1;
	        if(arr[i] == i+1 || arr[rigthindex] == arr[i])
	        i++;
	        else 
	        swap(arr, i , rigthindex);
	        }
	        for(i=0; i<arr.length; i++){
	        if(arr[i] != i +1) 
	        list.add(arr[i]);
	    }
	    return list;
}
	    public static void swap(int [] arr , int i, int j){
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter Array Size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++){
		    System.out.print("Enter " + (i)+ " Element of Array : ");
		    arr[i] = sc.nextInt();
		    }
		    System.out.println("");
		    ArrayList<Integer> ans = DuplicateNumber(arr);
		    System.out.print("Duplicate Number : "+ans);
		
	}
}