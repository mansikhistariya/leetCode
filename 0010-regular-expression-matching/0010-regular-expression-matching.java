class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] ans = new boolean[s.length() + 1][p.length() + 1];
        ans[0][0] = true;

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (i == 0) {
                    ans[i][j] = p.charAt(j - 1) == '*' && ans[i][j - 2];
                } else {
                    char ch = p.charAt(j - 1);
                    char sc = s.charAt(i - 1);

                    if (ch == '*') {
                        ans[i][j] = ans[i][j - 2] || (p.charAt(j - 2) == '.' || p.charAt(j - 2) == sc) && ans[i - 1][j];
                    } else if (ch == '.' || ch == sc) {
                        ans[i][j] = ans[i - 1][j - 1];
                    } else {
                        ans[i][j] = false;
                    }
                }
            }
        }
        return ans[s.length()][p.length()];
    }
}
