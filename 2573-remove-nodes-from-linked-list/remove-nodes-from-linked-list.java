/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        Stack<ListNode> stack=new Stack<>();
        while(curr!=null){
            if(!stack.isEmpty() && stack.peek().val<curr.val){
                stack.pop();
            }
            else{
                stack.push(curr);
                curr=curr.next;
            }
        }
        ListNode agla=null;
        while(!stack.isEmpty()){
            curr=stack.pop();
            curr.next=agla;
            agla=curr;
        }
        return curr;
    }
}