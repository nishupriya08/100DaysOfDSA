package Day6;

public class Solution {
    public int missingNumber(int[] nums) {
        int missing_num = 0;
        Arrays.sort(nums);
        for(int i=1; i<=nums.length; i++) {
            if(i!=nums[i-1]) {
                missing_num = i;
            }
        }
        return missing_num;
    }
}
