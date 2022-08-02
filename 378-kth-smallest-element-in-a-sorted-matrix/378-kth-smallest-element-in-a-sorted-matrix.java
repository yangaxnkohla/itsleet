class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int smallest = matrix[0][0];
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                nums.add(matrix[i][j]);
            }
        }
        Collections.sort(nums);
        return nums.get(k-1);
    }
}