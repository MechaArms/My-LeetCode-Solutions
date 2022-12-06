/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) return null
        if (l1 == null) return l2
        if (l2 == null) return l1
        val head: ListNode
        var p: ListNode
        var n1 = l1
        var n2 = l2
        if (n1.`val` > n2.`val`) {
            head = n2
            p = head
            n2 = n2.next
        } else {
            head = n1
            p = head
            n1 = n1.next
        }
        while (n1 != null || n2 != null) {
            if (n1 == null) {
                p.next = n2
                break
            } else if (n2 == null) {
                p.next = n1
                break
            }
            if (n1.`val` > n2.`val`) {
                p.next = n2
                p = p.next
                n2 = n2.next
            } else {
                p.next = n1
                p = p.next
                n1 = n1.next
            }
        }
        return head
    }
}
