class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode (-1);
        ListNode i = head;
        ListNode t = dummy;
        while(i != null){
        if(i.next == null || i.val != i.next.val){
            t.next = i;
            t = i;
            i = i.next;
        }
        else  {// i.val == i.next.val
        ListNode j = new ListNode();
        j = i.next ;
        while(j.next != null && j.val == j.next.val){
             j = j.next;
        }
        i =j;
        }
        }
        t.next = i;
        return dummy.next;
    }
}