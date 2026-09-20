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
   void Display(){
     if(head == null) return;
     Node temp = head;
     while(temp != null){
     System.out.print(temp.val+" ");
     temp = temp.next;
   }
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
	}
}