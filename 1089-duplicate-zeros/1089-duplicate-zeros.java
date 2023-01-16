class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length-1; j >= i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i++] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}