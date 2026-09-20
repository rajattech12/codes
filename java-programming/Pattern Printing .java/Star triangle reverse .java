import java.util.Scanner;
public class startrianglereverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		int n = sc.nextInt();
		 
		 for(int i=1; i<=n; i++){
		     for(int j=1; j<=n; j++){
		         if((i+j)<=n)
		         System.out.print( " "+" ");
		         else 
		         System.out.print("*"+" ");	         
		         }
		     System.out.println(" "+" ");
		     }
		     
	}
}