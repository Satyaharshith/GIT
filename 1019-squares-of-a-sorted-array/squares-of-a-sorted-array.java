class Solution {
    public int[] sortedSquares(int[] nums) {
       int left=0;
       int right=nums.length-1;
       int[] sum=new int[nums.length];
       int i=0;
       while(left<=right){
         sum[i] = nums[left]* nums[left];
            left++;
            i++;
       } 
       Arrays.sort(sum);
       return sum;
    }
}