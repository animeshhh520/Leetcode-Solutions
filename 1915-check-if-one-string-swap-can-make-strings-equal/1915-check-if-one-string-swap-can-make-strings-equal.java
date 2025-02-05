class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int diffCount = 0;
        char diffS1 = '\0';
        char diffS2 = '\0';

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount == 1) {
                    diffS1 = s1.charAt(i);
                    diffS2 = s2.charAt(i);
                } else if (diffCount == 2) {
                    if (s1.charAt(i) != diffS2 || s2.charAt(i) != diffS1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return diffCount == 0 || diffCount == 2;   }
}