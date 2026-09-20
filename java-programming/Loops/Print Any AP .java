import java.util.Scanner;
public class print1ton {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter First term : ");
	int ft = sc.nextInt();
	System.out.print(" Enter comment difference : ");
	int cd = sc.nextInt();
    System.out.print("Enter of number of terms : ");
	int n = sc.nextInt();
	   int m = ft;
		for(int i = 0; i <= n; i++){
		     System.out.print(+m+" ");
		     m = m + cd;
		    }	
	}
}