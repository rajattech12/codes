import java.util.Scanner;
public class holoreactangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		System.out.print("Enter m value : ");
		int m = sc.nextInt();
		 
		 for(int i=1; i<=n; i++){
		     for(int j=1; j<=m; j++){
		         if((i==1 || i==n) || (j==1 || j==m))
		         System.out.print("*");
		         
		         else
		         System.out.print(" "+" ");
		         }
		         System.out.println(" ");
		     }
	}
}