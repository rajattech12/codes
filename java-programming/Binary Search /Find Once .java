import java.util.*;
public class FirstOnce {
	public static int FindOnce(int[] arr){
	    int n = arr.length;
	    if(n==1) return arr[0];
	    if(arr[0] != arr[1]) return arr[0];
	    if(arr[n-1] != arr[n-2]) return arr[n-1] ;
	    int lo = 0 , hi = n-1;
	    while(lo<=hi){
	        int mid = lo+(hi-lo)/2;
	        if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1])
	        return arr[mid];
	        int f = mid; 
	        int s = mid;
	        if(arr[mid] == arr[mid-1])
	        f = mid -1;
	        else
	        s = mid +1;
	        
	        int Countleft = f - lo;
	        int Countright = hi - s;
	         if(Countleft%2 ==0)
	         lo = s + 1;
	         else
	         hi = f - 1;
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
		    System.out.print("Enter "+(i)+" Element of Array : ");
		    arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=0; i<arr.length; i++){
		        System.out.print(arr[i]+" ");
		         }
		      System.out.println();   
	   int ans = FindOnce(arr);
	   System.out.print("Find Once "+ans+" ");
	}
}