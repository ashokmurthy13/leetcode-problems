
class MergeStringsAlternatively {

    /**
     * Time Complexity: O(m+n)
     * - Iterate over word1 and word2 once and push it to the results. It would take O(m+n) time.
     * Space Complexity: O(1)
     * - Without considering the space consumed by the input strings(word1 & word2) and the output string(result), we don't use more than constant space.
     */
    public String mergeAlternately(String word1, String word2) {
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        int len = Math.max(lenWord1, lenWord2);

        StringBuilder mergedString = new StringBuilder();
        for (int idx = 0; idx < len; idx++) {
            if (idx < lenWord1) {
                mergedString.append(word1.charAt(idx));
            }
            if (idx < lenWord2) {
                mergedString.append(word2.charAt(idx));
            }
        }
        return mergedString.toString();
    }
}

class Test {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        MergeStringsAlternatively mergeString = new MergeStringsAlternatively();
        String mergedString = mergeString.mergeAlternately(word1, word2);
        System.out.println(mergedString);
    }
}
