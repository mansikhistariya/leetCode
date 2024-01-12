class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        char[] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    
            int k = s.length() / 2;
            String s1 = s.substring(0, k);
            String s2 = s.substring(k , n);
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < ch.length; j++) {
                    if (s1.charAt(i) == ch[j]) {
                        count1++;

                    }

                }

            }
            for (int i = 0; i < s2.length(); i++) {
                for (int j = 0; j < ch.length; j++) {
                    if (s2.charAt(i) == ch[j]) {
                        count2++;

                    }

                }

            }
        if (count1 == count2) {
                return true;
            } else {
                return false;
            }
    }
}