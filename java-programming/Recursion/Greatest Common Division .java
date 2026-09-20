import java.util.Scanner;
public class GreatestCommonDivisior {
	public static int gcd(int a , int b){
	 if(a==0) return b;
	  return gcd(b%a, a); 
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print(" enter base : ");
	    int a = sc.nextInt();
	    System.out.print("Enter exponent : ");
	    int b = sc.nextInt();
	    gcd(a,b);
	    System.out.print(gcd(a,b));
	
	}
}