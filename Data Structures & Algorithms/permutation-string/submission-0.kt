class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val charArray = IntArray(26)
        val charArray2 = IntArray(26)
        var l = 0
        for (i in s1.indices) {
            charArray[s1[i] - 'a']++ // 1 1 1 0 0 ...
        }
        for (r in s2.indices) {
            charArray2[s2[r] - 'a']++
            while ((r - l + 1) > s1.length) {
                charArray2[s2[l] - 'a']--
                l++
            }
            if (charArray2.contentEquals(charArray)) {
                return true
            }
        }
        return false
    }
}
