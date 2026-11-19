class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size -1 

        while(left < right){
            val curSum = numbers[left] + numbers[right]
            when{
                curSum > target -> right--
                curSum < target -> left++
                else -> return intArrayOf(left + 1, right + 1)
            }

        }
        return intArrayOf()


    }
}
