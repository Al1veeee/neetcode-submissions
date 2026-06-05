class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        val maxLeft = IntArray(n)
        val maxRight = IntArray(n)
        var leftWall = 0
        var rightWall = 0

        for (i in 0 until n) {
            val j = n - 1 - i

            maxLeft[i] = leftWall
            maxRight[j] = rightWall

            leftWall = maxOf(leftWall, height[i])
            rightWall = maxOf(rightWall, height[j])
        } 
        var sum = 0
        for (i in 0 until n) {
            val pot = minOf(maxLeft[i], maxRight[i])
            sum += maxOf(0, pot - height[i])
        } 
        return sum
    }
}
