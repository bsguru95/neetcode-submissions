class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var visited = HashSet<Int>()
        for (num in nums){
            if(num in visited){
                return true
            }
            visited.add(num)
        }
        return false

    }
}
