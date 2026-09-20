import java.util.Scanner;
public class printtable {
    public static void main (String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter a value :");
        int n = sc.nextInt();
        
        int m = n;
        for (int i=1; i<=10; i++){
            System.out.println(+m);
         m = m+n;
      
    }
    }
}