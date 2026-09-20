import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // 2. Get the size of the array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        // 3. Initialize the array
        int[] arr = new int[n];
        
        // 4. Use a loop to take input for each element
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Always close the scanner when done
        sc.close();
    }
}
