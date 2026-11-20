class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char,Int>()
        var l = 0
        var res = 0

        for(r in s.indices){
            if(s[r] in map){
                l = maxOf(map[s[r]]!! + 1, l)
            }
            map[s[r]] = r
            res = maxOf(res, r - l + 1)
        }
        return res

    }
}
