class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainingNum = target - nums[i];

            if (valueIndexMap.containsKey(remainingNum)) {
                return new int[] {valueIndexMap.get(remainingNum), i};
            }
            valueIndexMap.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
