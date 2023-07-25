class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int pos = -1;
        int prev = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (chars.containsKey(s.charAt(i))) {
                int value = chars.get(s.charAt(i)) + 1;
                chars.put(s.charAt(i), value);
                pos = prev;
            } else {
                chars.put(s.charAt(i), 1);
                pos = i;
                prev = pos;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (chars.get(s.charAt(i)) == 1) {
                System.out.println("Prev : " + prev);
                return i;
            }
        }
        
        return -1;
    }
}