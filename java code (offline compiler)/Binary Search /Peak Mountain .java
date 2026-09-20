import java.util.*;
public class PeakInMountain {
	public static int PeakMountin(int[] a){
	    int lo = 1, hi = a.length-2;
	    while(lo<=hi){
	        int mid = lo+(hi-lo)/2;
	        if(a[mid-1] < a[mid] && a[mid] > a[mid+1])
	         return mid;
	         else if(a[mid]<a[mid-1])
	         hi = mid -1;
	        else 
	        lo = mid +1;
	        }
	        return -11;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
		    System.out.print("Enter "+(i)+" Eement of Array ; ");
		    arr[i] = sc.nextInt();
		    }
		  
		    for(int i=0; i<arr.length; i++){
		        System.out.print(arr[i]+" ");
		        }
		        System.out.println(" ");
		       int ans = PeakMountin(arr);
		       if(ans != -1)
		       System.out.print("Peak mount Index : "+ans);
		        else
		        System.out.print("Peak mountain Index : "+ans);
		        
		 System.out.println(" "); 
		              System.out.print("Peak element : "+arr[ans]);
		        
	}
}