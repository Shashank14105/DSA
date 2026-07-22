class Solution {
    public int removeDuplicates(int[] s) {
        int count = 0;
            for( int i=0; i<s.length; i++){

                if(i<s.length-1 && s[i]==s[i+1]){
                    continue;
                }
                else{
                    s[count] = s[i];
                    count++;
                }
            }
            return count;
    }
}