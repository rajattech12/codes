import java.util.Scanner;
public class  TowerOfHanoi{
	public static void hanoi(int n , char a, char b, char c){
     if(n==0){ 
     return;
     }
     hanoi(n-1,a,c,b);      // n-1 disk a to b vie c
     System.out.println(n+" disk "+a+"->"+c);
     // largest disk A to C  
     hanoi(n-1, b, a, c);  // n-1 disk s b to c vie a
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value : ");
		int n = sc.nextInt();
	   System.out.println("Move ⏬");
			hanoi(n,'A','B','C');
	}
}
 