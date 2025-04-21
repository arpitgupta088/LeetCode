
/* class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp!=nul){
            temp=temp.next;
            len++;             
            //ab length nikal aayi
        }
        if(len == n) return head.next;   //single length ki ll hai toh mtlb head delete krna h
        // n fron end = len-n+1 from start
        //len-n+1 ke liye hame len-n chahiye
        temp = head;  //temp ko null se wapas head pe lao
        for(int i=1; i<=len-n-1; i++){       //len-n-1 tak jump krna pdega 1 se
        temp = temp.next;
        }
        //deletion:-
        temp.next = temp.next.next;
        return head;
    }
} */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;  //have to dlt the head
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}