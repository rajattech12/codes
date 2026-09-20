import java.util.Scanner;
public class PowerLiner {
	public static int pow(int a, int b){
	    if(b==0) return 1;
	    int call = pow(a,b/2);
	    if (b%2==0) return call * call;
	    else return a * call * call; 
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  base : ");
		int a = sc.nextInt();
		System.out.print("Enter exponent :  ");
		int b = sc.nextInt();
		pow(a,b);
		System.out.print(pow(a,b));
	}
}