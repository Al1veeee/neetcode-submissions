class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val Smap = hashMapOf<Char, Int>()
        val Tmap = hashMapOf<Char, Int>()
        
        if (s.length != t.length) {
            return false
        }

        for (i in s) {
            Smap[i] = Smap.getOrDefault(i, 0) + 1
        }
        for (j in t) {
            Tmap[j] = Tmap.getOrDefault(j, 0) + 1
        }
        if (Smap == Tmap) {
            return true
        }
        return false
    }
}
