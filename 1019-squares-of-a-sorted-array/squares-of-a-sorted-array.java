class Solution {
    public int[] sortedSquares(int[] nums) {
       int left=0;
       int right=nums.length-1;
       int[] sum=new int[nums.length];
       while(left<=right){
         sum[left] = nums[left]* nums[left];
            left++;
       } 
       Arrays.sort(sum);
       return sum;
    }
}