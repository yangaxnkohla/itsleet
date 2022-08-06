class Solution {
    public int addDigits(int num) {
        String numStr = String.valueOf(num);
        
        if (numStr.length() == 1) return num;
        
        while (numStr.length() > 1) {
            char[] nums = numStr.toCharArray();
            int sum = 0;
            for (int i = 0;i < nums.length; i++) {
                sum += Integer.parseInt(String.valueOf(nums[i]));
            }
            if (String.valueOf(sum).length() == 1) {
                return sum;
            }
            numStr = String.valueOf(sum);
        }
        
        return -1;
    }
}