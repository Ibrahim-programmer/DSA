class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return new ArrayList<Integer>();
        }
        List<Integer> ans = new ArrayList<>();
        int arr_p[] = new int[26];
        for (char i : p.toCharArray()) {
            arr_p[i - 'a']++;
        }
        int n = s.length();
        int i = 0, j = 0;
        int arr_s[] = new int[26];
        while (j < n) {
            arr_s[s.charAt(j) - 'a']++;
            if (j - i + 1 > p.length()) {
                arr_s[s.charAt(i) - 'a']--;
                i++;
            }
            if (j - i + 1 == p.length()) {

                boolean check = true;
                for (int k = 0; k < 26; k++) {
                    if (arr_p[k] != arr_s[k]) {
                        check = false;
                    }
                }
                if (check) {
                    ans.add(i);
                }
            }
            j++;
        }
        return ans;
    }
}