class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;
        Map<Character, Integer> mp = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for (char i : s1.toCharArray()) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            char temp = s2.charAt(i);
            mp2.put(temp, mp2.getOrDefault(temp, 0) + 1);
            if (i-j+1 > s1.length()) {
                if (mp2.get(s2.charAt(j)) - 1 == 0) {
                    mp2.remove(s2.charAt(j));
                } else
                    mp2.put(s2.charAt(j), mp2.get(s2.charAt(j)) - 1);

                j++;
            }
            if (mp2.equals(mp)&&i-j+1== s1.length()) {
                return true;
            }
        }
        return false;
    }
}