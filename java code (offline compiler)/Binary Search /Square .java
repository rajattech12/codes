import java.util.Scanner;
public class SquareRoot {
	public static int SquareRoot(int n){
	    if(n==0) return 0;
	    int lo = 1 , hi = n ;
	    while(lo<=hi){
	        int mid = lo+(hi-lo)/2;
	        if(mid == n/mid)
	            return mid;
	        else if(mid>n/mid)
	                 hi = mid-1;
	          else
	                lo = mid +1;            
	        }
	        return hi;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		int n = sc.nextInt();
		
		 int ans = SquareRoot(n);
		 System.out.print(ans);
		
		
	}
}