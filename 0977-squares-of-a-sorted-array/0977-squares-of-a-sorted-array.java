class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] temp = nums;
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= temp[i];
        }
        Arrays.sort(temp);
        return temp;
    }
}