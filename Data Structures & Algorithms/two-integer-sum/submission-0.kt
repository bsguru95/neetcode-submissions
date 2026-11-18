class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>()

        for ((i, n) in nums.withIndex()) {
            val diff = target - n
            seen[diff]?.let { return intArrayOf(it, i) }
            seen[n] = i
        }
        return intArrayOf()
    
    }
}
