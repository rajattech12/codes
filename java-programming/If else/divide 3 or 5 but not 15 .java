import java.util.Scanner;
public class divide3or5not15 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	
		if((n%3==0) || (n%5==0)){
		    if(n%15!=0)
		    System.out.print(n+" is divided by 3 or 5 but not 15");
		    else
		    System.out.print(" Required consitnot matching");
	}
	}
}