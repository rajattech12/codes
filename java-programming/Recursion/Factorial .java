import java.util.Scanner;
public class factroial {
	public static int factorial(int n){
	    if(n<=1) return 1;
	    return n*factorial(n-1);
	    
	    
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		int n = sc.nextInt();
		factorial(n);
		System.out.print(factorial(n));
	}
}