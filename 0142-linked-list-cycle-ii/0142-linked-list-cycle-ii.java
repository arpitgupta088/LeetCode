public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast==slow) break;
            //fast ko 2 se aur slow ko 1 se badhake ek sath le aao
        }
        if(fast!=slow) return null;
        //fir ek naya temp bnao head pe aur use travel krao slow ke sath ek ek aage
        //jab tk temp aur slow ek sath ni ho jaate
        //equal hote hi slow return krdo usse pta chlega ki cycle kaha se start hui
        ListNode temp = head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
}