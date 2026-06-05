class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            val find = target - nums[i]
            if (map.contains(find)) {
                return intArrayOf(map[find]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}
