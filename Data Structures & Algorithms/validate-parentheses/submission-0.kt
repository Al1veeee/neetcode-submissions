class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val hashMap = mapOf(
            '}' to '{',
            ')' to '(',
            ']' to '['
        )
        for (c in s) {
            if (c !in hashMap) {
                stack.add(c)
            } else {
                if (stack.isEmpty()) {
                    return false
                } else {
                    var popped = stack.removeAt(stack.size-1)
                    if (popped != hashMap[c]) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}
