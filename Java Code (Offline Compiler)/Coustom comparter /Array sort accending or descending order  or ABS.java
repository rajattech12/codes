import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Integer[] arr = {3,-1,5,2,-7,4,9};
		Arrays.sort(arr,(a,b) -> Math.abs(a)-Math.abs(b));
		print(arr);
	}
	public static void print(Integer[] arr){
	    for(int ele : arr){
	        System.out.print(ele + " ");
	        }
	        System.out.println();
	    } 
}