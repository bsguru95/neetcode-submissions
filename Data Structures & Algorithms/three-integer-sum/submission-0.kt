class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val result = mutableListOf<List<Int>>()
        nums.sort()

        for(i in nums.indices){
            val initial = nums[i]
            if(initial > 0) break
            if (i > 0 && initial == nums[i - 1]) continue

            var l = i + 1
            var r = nums.size - 1
            while(l<r){
                val solution = initial + nums[l] + nums[r]
                when{
                    solution > 0 -> r--
                    solution < 0 -> l++
                    else ->{
                    result.add(listOf(initial,nums[l],nums[r]))
                        l++
                        r--
                        while(l < r && nums[l] == nums[l - 1]){
                            l++
                        }
                    }
                }

             }
        }
    return result

    }
}
