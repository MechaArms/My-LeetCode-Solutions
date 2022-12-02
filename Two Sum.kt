/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
*/

//My solution
//===========

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var answer = mutableListOf<Int>()
        loop@ for (i in nums.indices){
            for (j in nums.indices){
                if (nums[i] + nums[j] == target && i != j) {
                    answer.add(i)
                    answer.add(j)
                    break@loop
                }
            }
        }
        return answer.sorted().toIntArray()
    }
}


//Clever solution
//===============

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    return intArrayOf(i, j)
                }
            }
        }
        return null
    }
}
