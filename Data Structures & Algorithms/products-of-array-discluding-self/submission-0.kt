class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
       
        // var n = nums.size
        //  var result = IntArray(n)

        // for(i in 0 until n){
        //     var prod = 1
        //     for(j in 0 until n){
        //        if(i == j) continue
        //        prod *= nums[j]     
        //     }
        //     result[i] = prod


        // }
        // return result 

        var solution = IntArray(nums.size) { 1 }

        var prefix = 1

        for (i in nums.indices){
            solution[i] = prefix
            prefix *= nums[i]
        }

        var postfix = 1
        for( i in nums.size - 1 downTo 0){
            solution[i] *= postfix
            postfix *= nums[i]
        }

    return solution
    }
}
