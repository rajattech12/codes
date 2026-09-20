import java.util.Scanner;
public class printstarsintheshapofrectamgleorsquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of row ; ");
		int n = sc.nextInt();
		System.out.print("Enter number of coloum ; ");
		int m = sc.nextInt();
	     
	     	for(int i=0; i<=n; i++){
	     	    for(int j=0; j<=m; j++){
	     	        System.out.print("*"+" ");
	     	        }
	     	        System.out.println(" ");
	     	    }	
		
	}
}