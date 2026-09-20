import java.util.Scanner;
public class combination {
 public static int  fact(int x){
     int xfact = 1;
         for(int i=1; i<=x; i++){
             xfact = xfact * i;
         }
         return xfact;
     }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		   int n = sc.nextInt();
		   System.out.print("Enter the value of r : ");
		   int r = sc.nextInt();
		    
		    int ncr = fact(n)/(fact(r)*fact(n-r));
		    System.out.print(ncr);
	}
}