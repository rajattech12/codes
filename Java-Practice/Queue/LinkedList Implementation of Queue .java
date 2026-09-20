class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        }
    }
public class myQueue {
	Node head;
	Node tail;
	int size;
	
	int peek(){
	     if(size == 0 ){
       System.out.print("Queue is Empty");
       return-1;
	     }
       return head.val;
	  }
   int remove(){
       if(size == 0 ){
       System.out.print("Queue is Empty");
       return-1;
       }
       int front = head.val;
       head = head.next;
       return front;
       }    
	void add(int val){
	    Node temp  = new Node(val);
	    if(size == 0 )
	    head = tail = temp;
	    else{
	        tail.next = temp;
	        tail = temp;
	        }
	        size++;
	    
	    }
	void Display(){
	    Node temp = head;
	    while(temp!=null){
	      System.out.print(temp.val+" ");
	      temp = temp.next;  
	        }
	        System.out.println(" ");
	    }
	public static void main(String[] args) {
	  myQueue q = new myQueue();
	   q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
	   q.Display();  
	   System.out.println(q.remove());	
	     q.Display();  
	   System.out.print(q.peek());
	}
}