class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int last = arr.length;
        return arr[last - 1].length();
    }
}