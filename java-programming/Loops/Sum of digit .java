import java.util.Scanner;
public class sumofdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a value : ");
	int n = sc.nextInt();
		int lastdigit;
			int sum = 0;
		while(n!=0){
		  lastdigit = n%10;
		  sum = sum + lastdigit;
		  n = n/10;
		   
		    }
	System.out.print(sum);
	}
	
}