class Node{
    int val ;
    Node next;
    Node (int val){
        this.val = val ;
    }
        }
        class MyStack{
            Node head;
            int len;
      
      int peak() throws Exception {
            if(head == null){
                throw new Exception ("Stack overflow ");
                           
                }
                return head.val;
            }
            void pop() throws Exception {
                        if(head == null){
                            throw new Exception ("Stack overflow");
                        }
                        Node x = head;
                        head = head.next;
                        len--;
                   }    
               void push( int els){
                 Node temp = new  Node(els);
                       if(head == null){
                           head = temp;
                           }
                           else {
                               temp.next = head;
                               head = temp;
                              
                           }
                            len++;
                       } 
                       int size(){
                          return len;
                           }
              void  Display(){
                  Node temp = head;
                  while(temp != null){
                      System.out.print(temp.val+" ");
                       temp = temp.next;               
                       }
                       System.out.println(" ");
                  }
        }
public class psks {
	public static void main(String[] args) throws Exception {
    MyStack ll = new MyStack();    		
    ll.push(10);	
   ll.push(20);	
   ll.push(30);	
	ll.push(40);
   ll.Display();
	ll.pop();
	ll.Display();
	System.out.println(ll.peak());
   	System.out.println(ll.size());
			}
}
