class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val = val;
        }
}
class LinkedList{
  Node head;
  Node tail;   
    int size;
    void addAtTail(int val){
  Node temp = new Node(val);  
   if(head == null)
     tail = head = temp;
     else{
         tail.next= temp;
         tail = temp;
         }
         size++;
   }

void addAthead(int val){
  Node temp = new Node(val);  
   if(head == null)
     tail = head = temp;
         else{
             temp.next = head;
             head = temp;
             }
         size++;
   }
   void Delete(){
       if(head == null ){
       System.out.print("LinkedListbis Empty");
       return;
       }
       head = head.next;
       size--;
       if(head == null){
           tail = null;
          
           }
       }
       int get(int idx){
           Node temp = head;
           
           for(int i=1; i<=idx; i++){
               temp = temp.next;
               }
           
               return temp.val;
           }
   void Display(){
     if(head == null) return;
     Node temp = head;
     while(temp != null){
     System.out.print(temp.val+" ");
     temp = temp.next;
   }
   System.out.println(" ");
   }
   }
public class LinkedlistDataStructure {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
	     ll.addAtTail(10);
	     ll.addAtTail(20); 
	     ll.addAtTail(30);
	     ll.addAtTail(40);
	     ll.Display();
	     ll.addAthead(50);
	     ll.Display();
	     ll.Delete();
	     ll.Display();
	     System.out.println("LinkedList size : "+ll.size);
	     
	     System.out.print(ll.get(3));
	}
}