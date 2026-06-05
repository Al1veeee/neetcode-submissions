class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        var result = mutableListOf<List<Int>>()

        for (f in 0 until nums.size-2) {

            if (f > 0 && nums[f] == nums[f-1]) continue

            var l = f + 1
            var r = nums.size-1

            while (l < r) {

                var sum = nums[f] + nums[l] + nums[r]
                when {
                    sum < 0 -> l++
                    sum > 0 -> r--
                    else -> { // sum = 0
                        result.add(listOf(nums[f], nums[l], nums[r]))

                        while (l < r && nums[l] == nums[l + 1]) l++
                        while (l < r && nums[r] == nums[r - 1]) r--

                        l++
                        r--
                    }
                }
            }
        } 
        return result
    }
}
