class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }
        
        return mapS.equals(mapT);
    }
}
