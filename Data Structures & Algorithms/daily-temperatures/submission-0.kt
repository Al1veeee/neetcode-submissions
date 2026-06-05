class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size
        val answer = IntArray(n) { 0 }
        val stack = mutableListOf<Pair<Int,Int>>()

        for (i in temperatures.indices) {
            val t = temperatures[i]
            while (stack.isNotEmpty() && stack.last().first < t) {
                val (stackT, stackI) = stack.removeAt(stack.size - 1)
                answer[stackI] = i - stackI 
            }
            stack.add(Pair(t, i))
        }
        return answer
    }
}