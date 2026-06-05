class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charArray = IntArray(26)
        for (i in s.indices) {
            charArray[s[i] - 'a']++
            charArray[t[i] - 'a']--
        }
        return charArray.all { it == 0 }
    }
}
