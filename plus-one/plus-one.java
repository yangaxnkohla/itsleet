class Solution {
    public int[] plusOne(int[] digits) {
        boolean allNine = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                allNine = false;
                break;
            }
        }
        
        if (allNine) {
            int[] temp = new int[digits.length+1];
            temp[0] = 1;
            for (int i = 1; i < temp.length; i++) {
                temp[i] = 0;
            }
            return temp;
        } 
        
        int high = digits.length - 1;
        if (digits[high] == 9) {
            int index = high;
            while (digits[index] == 9) {
                digits[index] = 0;
                index--;
            }
            System.out.println("index: " + index);
            digits[index] += 1; 
        } else {
            digits[high] += 1;
        }
    
        return digits;
    }
}