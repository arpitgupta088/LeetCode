class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = head;   // also we can write ListNode nex;
        while(curr!=null){
            nex  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
}

// recursive solution.............................
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null || head.next==null) return head;
//         ListNode a = head.next;
//         ListNode newHead = reverseList(a);
//         a.next = head;
//         head.next = null;
    
//     return newHead;
//     }
// }