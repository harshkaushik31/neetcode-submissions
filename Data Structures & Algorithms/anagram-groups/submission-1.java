class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int [] freq = new int[26];
            for(char ch : str.toCharArray()){
                freq[ch - 'a']++;
            }

            // Convert freq to string for key in map
            StringBuilder frqStr = new StringBuilder();
            for(int i = 0; i < 26; i++){
                frqStr.append(freq[i]).append('#');
            }

            map.computeIfAbsent(frqStr.toString(), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
