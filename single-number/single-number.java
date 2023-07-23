class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                int value = numbers.get(nums[i]) + 1;
                numbers.put(nums[i], value);
            } else {
                numbers.put(nums[i], 1);
            }
        }
        
        for (int key : numbers.keySet()) {
            if (numbers.get(key) == 1) {
                return key;
            }
        }
        
        return -1;
    }
}