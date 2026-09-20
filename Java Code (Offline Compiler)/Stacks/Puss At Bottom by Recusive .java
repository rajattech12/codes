import java.util.Stack;

public class PussAtBottom {
	public static void pussAtBottom(Stack<Integer> st, int els){
    if(st.size() == 0){
        st.push(els);
        return;
        }
    int top = st.pop();
    pussAtBottom(st,els);
    st.push(top);
    }
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		int els= 50;
		System.out.println(st);
		pussAtBottom(st, els);
		System.out.print(st);
	}
}