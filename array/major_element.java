class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int num = -1;
        int major = nums.length/2;
        Arrays.sort(nums);
        
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i-1] == nums[i]){
                count++;
                
            }
            else{
                if(count > major){
                num = nums[i-1];
                break;
                }
                
                else{
                  count = 1;  
                }
                
            }
            
        }
        if(count > major && num == -1){
            num = nums[nums.length - 1];
        }
        return num;
    }
}
