/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { 
        val = x; 
    }
 * }
 */

//MATLAB hame jo node dlt krni h uske piche ki node ni de rkhi i.e. idx - 1 wali ni de rkhi
//  10 -> 20 -> 30 -> 40 -> 50 -> null
                  // node
// so node ke value me node ke next ki value i.e. 40 me 50 dedo
//  10 -> 20 -> 30 -> 50 -> 50 -> null
// 2 bar 50 ho jayega fir node ke next me node ke next ka next i.e. null dedo ////jisse baad wala 50 hat jayga

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}