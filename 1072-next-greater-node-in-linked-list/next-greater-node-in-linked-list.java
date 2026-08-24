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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> x=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            x.add(curr.val);
            curr=curr.next;
        }
        int[] ans = new int[x.size()];
        Stack<Integer> st=new Stack<>(); 
        for(int i=0;i<x.size();i++){
            while (!st.isEmpty() && x.get(i) > x.get(st.peek())){
                int index=st.pop();
                ans[index] = x.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}