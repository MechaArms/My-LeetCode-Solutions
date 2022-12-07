/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/

// My solution
// ===========

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int { 
        var i = 0
        while (i < nums.size) {
            if (nums[i] == target) return i
            if (i == 0 && target < nums[i]) return i
            if (i > 0 && target > nums[i-1] && target < nums[i]) return i
            i++
        }
        return i
    }
}

// Best Solution
// =============

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
		nums.indexOfFirst { it >= target }.let { return if (it != -1) it else nums.size }
	}
}
