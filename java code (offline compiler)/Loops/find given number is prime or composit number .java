import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		 Boolean flag = false;
		for(int i = 2; i<=n-1; i++){
		    if(n%i==0){
		        flag = true;
		        break;
		        }
		    }
		    if(n==1) 
		    System.out.print(" 1 is neither prime nor comosite number");
		    else if   (flag==false)
		    System.out.print("Given number is prime number");
		   else 
		    System.out.print("Given number is composite number");
		
	}
}