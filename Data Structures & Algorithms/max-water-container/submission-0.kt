class Solution {
    fun maxArea(heights: IntArray): Int { // 4 + 1 + 2 + 3
        var l = 0
        var r = heights.size-1
        var max = 0
        while (l < r) {
            val w = r - l // 7 - 1 = 6
            val h = minOf(heights[l], heights[r])
            val result = w * h // 6 * 1 = 6
            max = maxOf(max, result) // max = 6
            if (heights[l] < heights[r]) {
                l++
            } else {
                r--
            }
        }
        return max
    }
}
