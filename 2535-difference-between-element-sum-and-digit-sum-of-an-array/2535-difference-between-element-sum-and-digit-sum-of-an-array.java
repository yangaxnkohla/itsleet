class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = sum(nums);
        int digitSum = sum(getDigits(nums));
        
        return Math.abs(elementSum - digitSum);
    }
    
    public int[] getDigits(int[] nums) {
        List<Integer> digits = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            String[] numArr = String.valueOf(nums[i]).split("");
            for (int j = 0; j < numArr.length; j++) {
                digits.add(Integer.parseInt(numArr[j]));
            }
        }
        
        int[] array = new int[digits.size()];
        for(int i = 0; i < digits.size(); i++) array[i] = digits.get(i);
        
        return array;
    }
    
    public int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}