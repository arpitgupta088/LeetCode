class Solution {
    public ListNode reverseList(ListNode head){  // second half list ko reverse karo
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = head;
        while(curr!=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){  //middle of odd LL 
                                                      // and left  middle of even LL
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        ListNode leftMiddle = middleNode(head);  //left middle dedega
        ListNode head2 = leftMiddle.next;  //leftmid ke next ko head2 se connect krke  
        leftMiddle.next = null;            //leftmid ke next ko null krdo
        head2 = reverseList(head2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head!=null && head2!=null){
            temp.next=head;
            head=head.next;
            temp=temp.next;
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        if(head==null) temp.next=head2;
        if(head2==null) temp.next=head;
        head=dummy.next;
    }
}