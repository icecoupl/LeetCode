class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needlelength = needle.length();
        
        for (int i = 0; i < haystackLength; i++) {
            int index = 0;
            if (i + needlelength > haystackLength) {
                return -1;
            }
            if (haystack.substring(i, i+1).equals(needle.substring(0, 1))) {
                for (int a = 0; a < needlelength; a++) {
                    if (haystack.substring(i+a, i+a+1).equals(needle.substring(a, a+1)) == false) {
                        break;
                    } else {
                        index++;
                    }
                    if (index == needlelength) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}