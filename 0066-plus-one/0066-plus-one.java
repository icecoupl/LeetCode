class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] = digits[i] + 1;
        int[] temp = new int[digits.length + 1];
        boolean carry = false;
        while (i >= 0) {
            if (carry == true) {
                digits[i] = digits[i] + 1;
                carry = false;
            }
            if (digits[i] == 10) {
                digits[i] = 0;
                carry = true;
                if (i == 0) {
                    temp[0] = 1;
                    for (int a = 0; a < digits.length; a++) {
                        temp[a + 1] = digits[a];
                    }
                    return temp;
                }
                i--;
            } else {
                return digits;
            }
        }
        return digits;
    }
}