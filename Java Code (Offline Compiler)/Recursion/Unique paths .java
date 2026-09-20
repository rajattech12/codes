   import java.util.Scanner;
   public class UniquePaths {
	public static int uniquepaths(int n ,int m){
	    if(n==1 || m==1) return 1;
	    return uniquepaths(n-1,m)+uniquepaths(n,m-1);
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Row ; ");
		int n = sc.nextInt();
		System.out.print("Enter number of coloum : ");
		int m = sc.nextInt();
		
		uniquepaths(n,m);
		System.out.print(uniquepaths(n,m));
        	
	}
}
