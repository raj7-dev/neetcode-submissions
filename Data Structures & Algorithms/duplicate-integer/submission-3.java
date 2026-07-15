class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        Set<Integer> seen = new HashSet<Integer>();

        for(int num : nums)
         {
            if(!seen.add(num))
               {
                return true;
               }
         }

         return false;
    }
}