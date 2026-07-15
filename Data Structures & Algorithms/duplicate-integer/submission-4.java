class Solution {
    public boolean hasDuplicate(int[] nums) {
        // if (nums.length == 0) {
        //     return false;
        // }

        // Set<Integer> seen = new HashSet<Integer>();

        // for(int num : nums)
        //  {
        //     if(!seen.add(num))
        //        {
        //         return true;
        //        }
        //  }

        //  return false;

        // this approach performacne as have to go through all elements
        return Arrays.stream(nums).distinct().count() != nums.length;

    }
}