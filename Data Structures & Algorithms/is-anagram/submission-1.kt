class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        if (sMap.size != tMap.size) {
            return false
        }
        for (i in 0 until s.length-1) {
            sMap[s[i]] = (sMap[s[i]] ?: 0) + 1
            tMap[t[i]] = (tMap[t[i]] ?: 0) + 1
        }
        if (sMap == tMap) {
            return false
        }
        return true
    }
}
