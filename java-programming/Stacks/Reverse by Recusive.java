import java.util.*;
public class ReverseStacks {
	public static void reverse(Stack<Integer> st){
	    if(st.size() ==0 )
	    return;
	        int top = st.pop();
	        reverse(st);
	        PussAtBottom(st, top);	        
	    }
	public static void PussAtBottom(Stack<Integer> st , int top){
	    if(st.size() == 0){
	        st.push(top);
	        return;
	        }
	        int top2 = st.pop();
	        PussAtBottom(st, top);
	        st.push(top2);
	        
	    }
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
//		int els= 50;
		System.out .println(st);
//		PussAtBottom(st , els);
		System.out.println(st);
		reverse(st);
		System.out.print(st);
	}
}