import java.util.*;
public class FirstAndLastOccurance {
	public static ArrayList<Integer> Firstoccurance(int[] a, int target){
	    ArrayList<Integer> list = new ArrayList<>();
	    int lo = 0, hi = a.length-1, idx = -1;
	    while(lo<=hi){
	        int mid = lo + (hi-lo)/2;
	        if(a[mid] > target)
	          hi = mid -1 ;
	         else if(a[mid] < target)
	         lo = mid + 1 ;
	         else{
	          idx = mid;
	          hi = mid - 1;
	      
	          }  
	        }
	            list.add(idx);
	        lo =0;
	        hi = a.length-1;
	        idx = -1;
	        while(lo<=hi){
	            int mid = lo + (hi- lo)/2;
	            if(a[mid] > target)
	            hi = mid-1;
	            else if(a[mid] < target)
	            lo = mid +1;
	            else{
	                idx = mid;
	                lo = mid +1;
	                
	                }
	            }
	            list.add(idx);
	            return list;
	    }
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Size of Array : ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0; i<arr.length; i++){
	     System.out.print("Enter " +(i+1)+ " Element of Array : ");
	        arr[i] = sc.nextInt();
	    }
	    System.out.print("Enter target Element : ");
	    int target = sc.nextInt();
	    Arrays.sort(arr);
	    for(int i=0; i<arr.length; i++){
	        System.out.print(arr[i] +" ");
	        }
	        System.out.println("");
	    ArrayList<Integer> ans = Firstoccurance(arr, target);
	    if(ans.isEmpty())
	    System.out.print("Element not found");
	    else
	    System.out.print("Index of Element ; " +ans);
	}
}