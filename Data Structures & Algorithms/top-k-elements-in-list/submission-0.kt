class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequency = HashMap<Int,Int>()

        for (num in nums){
            frequency[num] = frequency.getOrDefault(num,0) + 1
        }

        val heap = PriorityQueue<Pair<Int,Int>>(compareBy {it.first})

        for ((num, count) in frequency){
            heap.add(Pair(count, num))
            if(heap.size > k){
                heap.poll()
            }
        }
        
        val solution = IntArray(k)
        for (i in k - 1 downTo 0){
            solution[i] = heap.poll().second
        }
        return solution
      
    }
}
