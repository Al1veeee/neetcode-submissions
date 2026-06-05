class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<String, MutableList<String>>()
        for (s in strs) {
            val count = IntArray(26)
            for (char in s) {
                count[char - 'a']++
            }

            val key = count.joinToString(",")
            groups.computeIfAbsent(key) { mutableListOf() } .add(s)
        }
        return groups.values.toList()
    }
}
