import java.util.Scanner;
public class sumOfTwoAndFindElement {
	public static boolean TargetElement(int[] a, int[] b ,int target){
	   for(int i=0; i<a.length; i++){
	      for(int j=0; j<b.length; j++){
	      if(a[i]+b[j] == target) return true;
	     
	      }
	      }  
	      return false;
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Size of Array : ");
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0; i<a.length; i++){
          System.out.print("Enter "+(i+1)+" Element of Ist Array :");
          a[i] = sc.nextInt();
          }
          System.out.print("Size of Array ; ");
          int m = sc.nextInt();
          int[] b = new int[m] ;
          for(int i=0; i<b.length; i++){
              System.out.print("Enter "+(i+1)+" Element of Second Array : ");
              b[i] = sc.nextInt();
              }	
              System.out.print("Enter target element : ");
              int target = sc.nextInt();
              
               Boolean ans = TargetElement(a,b,target);
       
                System.out.println(ans);
                System.out.print("Target Element : "+target );
	}
}

