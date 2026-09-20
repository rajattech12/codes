import java.util.Scanner;
public class SumOfArrayElement {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Size of Array : ");
	  int n = sc.nextInt();
	  int[] arr = new int[n];
	  System.out.print("Enter Array Element : ");
	  for(int i=0; i<arr.length; i++){
	      arr[i] = sc.nextInt();
	      }
      int sum = 0;
      for(int i=0; i<arr.length; i++){
          sum += arr[i];
          }	
	System.out.print(sum);
	}
	
}