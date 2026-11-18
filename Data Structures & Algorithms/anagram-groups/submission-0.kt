class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val solution = HashMap<List<Int>,MutableList<String>>()

        for (s in strs){
            val count = MutableList(26) { 0 }
            for(c in s){
                count[c - 'a']++
            }
            solution.getOrPut(count) {mutableListOf()}.add(s)
        }

        return solution.values.toList()
    }
}
