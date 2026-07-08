class Solution {
    public int maxProduct(int[] nums) {
       int res = nums[0];
       int curMax = nums[0];
       int curMin = nums[0];

       for( int n= 1; n<nums.length;n++){
            int i = nums[n];
            int temp = curMax *i;

            curMax = Math.max(Math.max(temp,curMin *i),i);
            curMin = Math.min(Math.min(temp,curMin *i),i);

            res = Math.max(res,curMax);            
       }
       return res;
    }
}