import java.util.*;
public class TraversalInQueue {
	public static void addAtIndex(Queue<Integer> q , int idx , int value){
	    int n = q.size();
	    if(idx < 0 || idx > n )
	    System.out.print("Invalid idx");
	    
	//    if(idx<n){
	    for(int i=1; i<=idx; i++){
	        q.add(q.remove());
	        }
	        q.add(value);
	        for(int i=1; i<=n-idx; i++){
	            q.add(q.remove());
	            }
	  //  }
	    }
	    public static void Display(Queue<Integer> q){
	        int n = q.size();
	        for(int i=1; i<=n; i++){
	            System.out.print(q.peek() +" ");
	            q.add(q.remove());
	            }
	            System.out.println(" ");
	        }
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
		Display(q);
		addAtIndex(q,2,22);
		Display(q);
	}
}