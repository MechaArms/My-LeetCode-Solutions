/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false
*/

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val map = mapOf(')' to '(', ']' to '[', '}' to '{')
        return s.all {
            if (it !in map) {
                stack.add(it)
            } else {
                !stack.isEmpty() && stack.pop() == map[it]
            }
        } && stack.isEmpty()
    }
}

// Awnser link:
// https://richcodersandme.github.io/LeetCode-Solution/tips/021/


//clever solution
// ==============

class Solution {
   fun isValid(s: String): Boolean {
    val stack = Stack<String>()
        s.forEach {
            when (it.toString()) {
                "{" -> stack.push("}")
                "(" -> stack.push(")")
                "[" -> stack.push("]")
                else -> {
                    if (stack.isEmpty() || stack.pop() != it.toString()) {
                        return false
                    }
                }
            }

        }

        return stack.isEmpty()
   }
}
