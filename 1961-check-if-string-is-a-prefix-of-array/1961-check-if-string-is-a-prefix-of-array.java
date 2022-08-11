class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if(s.contains(words[i]) && result.equals(s)) {
                return true;
            }
        }

        return false;   
    }
}