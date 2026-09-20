import java.util.Scanner;
public class largestinthree {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first digit : ");
	int a = sc.nextInt();
	System.out.print("Enter secon digit : ");
	int b = sc.nextInt();
	System.out.print("Enter third digit : ");
	int c = sc.nextInt();
		
		if(a>b){
		  
		 System.out.print(a+" is greatest number");
		 }
		else{
		
		if(b>c)
		         System.out.print(b+ " is greatest number ");
		  else
		         System.out.print(c+" is greatest number ");
		     
		}
	}
}