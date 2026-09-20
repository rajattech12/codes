import java.util.Scanner;
public class threedigitnumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a value : " );
	int n = sc.nextInt();
	
		if((n<999) &&  (n>99))
		System.out.print("Given number is three digit number"+n);
		else
		System.out.print("Giver number is not a three digit number");
	}
}