/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

1->2->4

1->3->4
-------
1->1->2->3->4

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:

Input: list1 = [], list2 = []
Output: []

Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 
Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/


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


// Awnser link:
// https://richcodersandme.github.io/LeetCode-Solution/tips/021/
