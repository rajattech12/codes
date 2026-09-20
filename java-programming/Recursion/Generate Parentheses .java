import java.util.*;
public class GeerateParentheses {
	public List<String> generateParenthesis(int n){
	        List<String> ans = new ArrayList<>();
	        generate(n ,0 ,0 ,"" , ans);
	        return ans;
	        }
    private void generate(int n , int l , int r, String s, List<String> ans){
	    
	    if(r==n){
	        ans.add(s);
	        return;
	        }
	    
	    if(l<n)
	    generate(n , l+1, r , s+ "(" ,ans);
	    
	    if(r<l)
	    generate(n , l , r+1 , s + ")" ,ans);
	    
	    }
	    
	    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a value : ");
		       
        if (sc.hasNextInt()) {
		int n = sc.nextInt();
		
   GeerateParentheses obj = new GeerateParentheses();
		List<String> ans = obj.generateParenthesis(n);
            System.out.println(ans);
        }
        sc.close();
	}
}
