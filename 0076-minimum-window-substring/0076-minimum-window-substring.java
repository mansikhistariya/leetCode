class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        String result= "";
        String currentWindow="";
        int minWindowSize=n + 1;

        if (n <m) {
            return result;
        }

        int[] arr = new int[128]; 

        for (char ch:t.toCharArray()) {
            arr[ch]++;
        }

        int left= 0;
        int count= 0;

        for (int i= 0; i< n; i++) {
            char currentChar = s.charAt(i);

            if (arr[currentChar]>0) {
                count++;
            }

            arr[currentChar]--;

            while (count==m) {
                int windowSize = i - left + 1;

                if (windowSize <minWindowSize) {
                    minWindowSize = windowSize;
                    result = s.substring(left, i+ 1);
                }

                char leftChar = s.charAt(left);
                arr[leftChar]++;

                if (arr[leftChar] > 0) {
                    count--;
                }

                left++;
            }
        }

        return result;
    }
}
