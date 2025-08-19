
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode current = l3;
        int carry = 0;
        while((l1 != null)||(l2 != null)||(carry != 0)) {
            int sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            carry = (sum >= 10) ? 1 : 0;
            current.next = new ListNode(sum % 10);
            //操作指针时，定义新指针指向结点防止头结点位置改变
            current = current.next;
            if(l1 != null)    l1 = l1.next;
            if(l2 != null)    l2 = l2.next;
        }
        return l3.next;
    }
}
