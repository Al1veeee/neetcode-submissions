class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        int sizeS = s.length();
        int sizeT = t.length();

        if (sizeS != sizeT) {
            return false;
        }
        for (int i = 0; i < sizeS; i++) {
            char ch = s.charAt(i);
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < sizeT; i++) {
            char ch = t.charAt(i);
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }
        if (mapS.equals(mapT)) {
            return true;
        }
        return false;
    }
}
