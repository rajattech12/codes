class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val){
        this.val = val;
        }
    }
    class DDl{
        ListNode head;
        ListNode tail;
        int size;
        
        void insertAtHead(int val){
            ListNode temp = new ListNode(val);
            if(head == null){
                head = tail = temp;
                 } 
         else{        
        temp.next = head;
        head.prev = temp;
        head = temp;
        }
        size++;
        }
        void insertAtTail(int val){
            ListNode temp = new ListNode(val);
            if(head == null)
            head = tail = temp;
            else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                }
                size++;
            }
            void deleteAthead(){
                if(size ==0){
                System.out.print("list is Empty ");
                return;
                }
                if(size == 1){
                    head = tail ;
                    }
                    else{
                        head = head.next;
                        head.prev = null;
                        }
                        size--;
                }
         void deleteAtTail(){
             if(size == 0 ){
                 System.out.print("List is Empty");
                 return;      
                 }
                 if(size == 1)
                 head = tail = null;
                 else{
                  tail = tail.prev;
                  tail.next = null;   
                     }
                     size--;
             }       
             void display(){
                 ListNode temp = head;
                 while(temp != null){
                     System.out.print(temp.val +" ");
                     temp = temp.next;
                     }
                     System.out.println(" ");
                 }
                 void DisplayReverse(){
                     ListNode temp = tail;
                     while(temp != null){
                         System.out.print(temp.val + " ");
                         temp = temp.prev;
                         }
                         System.out.println(" ");
                     }
                     void insert(int idx , int val){
                         ListNode a = new ListNode(val);
                         ListNode temp =head;
                         for(int i=1; i<=idx-1; i++){
                             temp = temp.next;
                             }
                  ListNode b = temp.next;
                  temp.next = a;
                  a.prev = temp;
                  a.next  = b;
                  b.prev = a;
                  
                  size++;
    }
                    
        }
public class DoublyLinkedListClass {
	public static void main(String[] args) {
	     DDl list = new DDl();
	     list.insertAtHead(10);
	      list.insertAtHead(20);
	       list.insertAtHead(30);
	       list.insertAtTail(40);
	      list.insertAtTail(50);
	       list.insertAtTail(60);
	     list.display();
	 //    list.DisplayReverse();
	     list.deleteAthead();
	     list.deleteAtTail();
	     list.insert(3,400);
	     list.display();
	}
}