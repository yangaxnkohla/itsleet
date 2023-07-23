class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                int value = counts.get(nums[i]) + 1;
                counts.put(nums[i], value);
            } else {
                counts.put(nums[i], 1);
            }
        }
        
        for (int key : counts.keySet()) {
            if (counts.get(key) > 1) {
                return true;
            }
        }
        
        return false;
    }
}