package Day2;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        reverse(nums);
        int max=nums[k-1];
        return max;
    }
    public void reverse(int nums[]) {
        for(int i=0; i<nums.length/2; i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
    }
}{
}
