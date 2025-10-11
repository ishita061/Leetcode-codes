/*
49. Group Anagrams

Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for(String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);

            if(! m.containsKey(str)) {
                m.put(str, new ArrayList<>());
            }
            m.get(str).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
