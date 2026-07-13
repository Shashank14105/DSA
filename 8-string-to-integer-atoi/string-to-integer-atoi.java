class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;
        
        int i = 0, n = s.length();
        
        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
       
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        
        
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            
        
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }
        
        return (int) (result * sign);
    }
}