class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new  ListNode(-1);
        ListNode even = new  ListNode(-1);
        ListNode t = head;
        ListNode a = odd ;
        ListNode b = even;
        while(t != null){
            a.next = t;
            
            t = t .next;
            a = a.next ;
            b.next = t;
if(t != null)  t= t.next;
b = b.next;
        }
        a.next = even.next;
        return odd.next;
    }
}