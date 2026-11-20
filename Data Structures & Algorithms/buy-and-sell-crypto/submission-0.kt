class Solution {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var right = 1
        var profit = 0

        while(right < prices.size){
            if(prices[left] < prices[right]){
                val pr = prices[right] - prices [left]
                profit = maxOf(profit,pr)
            }else{
                left = right 
            }
            right++
        }
        return profit 

    }
}
