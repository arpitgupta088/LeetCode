
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1=0, val2=0;
            if(l1!=null) val1=l1.val;
            if(l2!=null) val2 = l2.val;
            int num = val1 + val2 + carry;
            ListNode ansNode = new ListNode (num%10);
            temp.next = ansNode;
            temp=temp.next;
            if(num>9) carry =1;
            else carry = 0;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry==1){            // l1 ya l2 ke null hone pe bhi agr carry 1 hai to
            ListNode node = new ListNode(1);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
}