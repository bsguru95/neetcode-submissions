class Solution {
    fun longestConsecutive(nums: IntArray): Int {
    //      if (nums.isEmpty()) return 0
    // val s = nums.sortedArray()
    // var best = 1
    // var cur = 1
    // for (i in 1 until s.size) {
    //     when {
    //         s[i] == s[i - 1] -> {}            // skip duplicate
    //         s[i] == s[i - 1] + 1 -> cur++
    //         else -> cur = 1
    //     }
    //     best = maxOf(best, cur)
    // }
    // return best


    val numSet = nums.toSet()
    var longest = 0
    for( num in numSet){

        if((num -1 ) !in numSet){
            var length = 1
            while((num + length) in numSet){
                length++
            }
            longest = maxOf(longest,length)
        }
    }
    return longest
    }
}
