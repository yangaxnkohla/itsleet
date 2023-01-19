class Solution {
    public int secondHighest(String s) {
        List<Integer> largest = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                largest.add(Integer.parseInt(Character.toString(s.charAt(i))));
            }
        }
        Collections.sort(largest);
        Set set = new HashSet(largest);

        System.out.println(Arrays.toString(set.toArray()));
        
        if (set.size() <= 1) 
            return -1;
        
        List<Integer> setList = new ArrayList<>(set);
        return setList.get(set.size() - 2);
    }
}