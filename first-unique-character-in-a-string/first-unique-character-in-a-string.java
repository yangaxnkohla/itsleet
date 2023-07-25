class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (chars.containsKey(s.charAt(i))) {
                int value = chars.get(s.charAt(i)) + 1;
                chars.put(s.charAt(i), value);
            } else {
                chars.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (chars.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}