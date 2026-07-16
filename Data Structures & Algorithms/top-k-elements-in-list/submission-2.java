class Solution {
    public int[] topKFrequent(int[] nums, int k) {
   Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Bucket numbers by their frequencies
        // Using an array of Lists where index represents the frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        // Step 3: Gather the top K elements safely
        int[] result = new int[k];
        int resultIndex = 0;

        // Iterate backwards from highest possible frequency down to 0
        for (int pos = bucket.length - 1; pos >= 0 && resultIndex < k; pos--) {
            if (bucket[pos] != null) {
                for (int num : bucket[pos]) {
                    result[resultIndex++] = num;
                    
                    // Senior Dev Check: Stop exactly when we hit 'k' elements 
                    // This prevents overflowing if a bucket contains more items than needed
                    if (resultIndex == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }

}
