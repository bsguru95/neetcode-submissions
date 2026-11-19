class Solution {

    fun encode(strs: List<String>): String {
        val solution = StringBuilder()
        for (str in strs){
            solution.append(str.length).append('#').append(str)
        }
        return solution.toString()

    }

    fun decode(str: String): List<String> {

        val solution = mutableListOf<String>()
        var a = 0

        while( a < str.length){
            var b = a
            while(str[b] != '#'){
                b++
            }
            val length = str.substring(a,b).toInt()
            a = b + 1
            solution.add(str.substring(a, a + length))
            a += length
        }
        return solution

    }
}
