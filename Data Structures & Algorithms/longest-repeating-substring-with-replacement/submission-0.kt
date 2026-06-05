class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var max = 0
        var l = 0
        val array = IntArray(26)
        for (r in s.indices) {
            array[s[r] - 'A']++
            while ((r - l + 1) - (array.maxOrNull() ?: 0) > k) {
                array[s[l] - 'A']--
                l++
            }
            max = maxOf(max, r - l + 1)
        }
        return max
    }
}
