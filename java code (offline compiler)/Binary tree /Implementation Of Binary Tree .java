import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        }
    }
    class pair{
        int level;
        Node node;
        pair(Node node, int level){
            this.node = node;
            this.level = level;
            }
        }
        class Quad{
            int max;
            int min;
            int size;
            int sum;
            Quad(int max, int min, int size, int sum){
                this.max = max;
                this.min = min;
                this.size = size;
                this.sum = sum;
                }
                 void display(){
                    System.out.println("Max value in binary tree  : " +max);
                    System.out.println("Min value in binary tree  : "+min);
                    System.out.println("Sixe of binary tree  : "+sum);
                    System.out.println("Sum of binary tree : "+size);
                    }
        }
  
public class ImplentationOfBinaryTree {
	public static Quad MaxMinSizeSum(Node root){
	    if(root == null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
	    Quad lst = MaxMinSizeSum(root.left);
	    Quad rst = MaxMinSizeSum(root.right);
	    int max = Math.max(root.val,Math.max(lst.max,rst.max));
	    int min = Math.min(root.val,Math.min(lst.min,rst.min));
	    int size = 1+lst.size+rst.size;
	    int sum = root.val + lst.sum + rst.sum;
	    return new Quad(max,min,size,sum);
	    }
	private static void Kthlevel(Node root, int level, int k){
	    if(root == null) return;
	    if(k == level){
	    System.out.print(root.val+" ");
	    return;
	    }
	    Kthlevel(root.left , level+1 , k);
	       Kthlevel(root.right , level+1 , k);
	       System.out.println();
	    }

	private static void LevelOrderLineWise( Node root){
	    Queue<pair> q = new LinkedList<>();
	    System.out.println("level order line wise 🔽 ");
	    int currlevel = 0;
	    q.add(new pair(root,0));
	    while(q.size() > 0){
	        pair front = q.remove();
	        Node node = front.node;
	        int level = front.level;
	        if(level != currlevel){
	            currlevel++;
	            System.out.println(" ");	            
	            }
	            System.out.print(node.val+" ");
	        if(node.left != null) q.add(new pair(node.left,level+1));
	        if(node.right != null) q.add(new pair(node.right,level+1));
	        }
	    }
	private static void LevelOrder(Node root){
	    Queue<Node> q = new LinkedList<>();
	   System.out.print("level order : ");
	     q.add(root);
	    while(q.size()>0){
	        Node front = q.remove();
	        System.out.print(front.val+" ");
	        if(front.left != null) q.add(front.left);
	        if(front.right != null) q.add(front.right);
	        
	        }
	    System.out.println(" ");
	    }
	private static int levels(Node root){
	    if(root == null) return 0;
	    return 1+ Math.max(levels(root.left) , levels(root.right));
	    }
	private static int max(Node root){
	    if(root == null) return Integer.MIN_VALUE;
	    return Math.max(root.val,Math.max((max(root.left)) , max(root.right)));
	    }
	    private static int min(Node root){
	        if(root == null) return Integer.MAX_VALUE;
	        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
	        }
	private static int multply(Node root){
	    if(root == null) return 1;
	    return root.val * multply(root.left) * multply(root.right);
	    }
	private static int sum(Node root){
	    if(root == null ) return 0;
	    return root.val + sum(root.left) + sum(root.right);
	    }
	private static int size(Node root){
	    if(root == null) return 0;
	    int leftsize = size(root.left);
	    int rightsize = size(root.right);
	    return 1+leftsize+rightsize; 
	    }
	private static void display(Node root){
	    if(root == null) return;
	    System.out.print(root.val+ " ");
	    display(root.left);
	    display(root.right);
	    }

	public static void main(String[] args) {
		Node a = new Node(3);
		Node b = new Node(4);
		Node c = new Node(2);
		Node d = new Node(-1);
		Node e = new Node(1);
		Node f = new Node(6);
		Node g = new Node(16);
		a.left = b; a.right = c;
	     b.left = d; b.right = e;
		c.left = f; c.right = g;
		display(a);
		System.out.println(" ");
    	System.out.print("Size Of BinaryTree : " +size(a));
    	System.out.println(" ");
    	System.out.print("Sum of BinaryTree : "+sum(a));
    	System.out.println(" ");
    	System.out.print("Multply of BinaryTree : "+multply(a));
    	
    	System.out.println(" ");
    	System.out.print("Maximum of BinarTree : " + max(a));
    	System.out.println(" ");
    	System.out.print("Manimum of BinarTree : " + min(a));
    	System.out.println(" ");
    	System.out.println("Levels of BinaryTree : "+levels(a));
    	LevelOrder(a);
        LevelOrderLineWise(a);
        System.out.println();
        Kthlevel(a,0,2); 
        MaxMinSizeSum(a).display();	
	
}
}