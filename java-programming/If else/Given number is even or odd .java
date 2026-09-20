import java.util.Scanner;
public class evenodd {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	
    if( n%2==0)
    System.out.print("Given number is even"); 
    else
    System.out.print("Givenumber is odd") ;  
	}
	}
