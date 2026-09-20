import java.util.Scanner;
public class  Reverse{
	public static int Reverse(int n,int r){
	    if(n==0) return r ;
	    return Reverse(n/10 , r*10 + n%10);
	      
	    }
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a value : ");
	   int n = sc.nextInt();
	   Reverse(n,0);
	  System.out.print(Reverse(n,0));   
	       
	}
}