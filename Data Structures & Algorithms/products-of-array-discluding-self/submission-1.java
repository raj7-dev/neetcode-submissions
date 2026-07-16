class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] leftPrefix = new int[n];
        int[] rightSuffix = new int[n];
        int[] result = new int[n];

        // 1. Compute prefix products from the left
        leftPrefix[0] = 1;
        for (int i = 1; i < n; i++) {
            leftPrefix[i] = leftPrefix[i - 1] * nums[i - 1];
        }

        // 2. Compute suffix products from the right
        rightSuffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightSuffix[i] = rightSuffix[i + 1] * nums[i + 1];
        }

        // 3. Combine prefix and suffix products
        for (int i = 0; i < n; i++) {
            result[i] = leftPrefix[i] * rightSuffix[i];
        }

        return result;
    }
}
