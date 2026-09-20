import java.util.Scanner;
public class absolutvalue {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a value : ");
	int n = sc.nextInt();
	
		if(n<0){
		n  = n*(-1);
	}
	System.out.print("The absolute value is : "+n);		
	}
}