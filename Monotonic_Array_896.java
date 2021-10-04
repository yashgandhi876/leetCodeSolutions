class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 2){
            return true;
        }
        
        int temp = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(temp == 0){
                if(nums[i] < nums[i+1]){
                    temp = 1;
                }else if(nums[i] > nums[i+1]){
                    temp = -1;
                }
            }    
            
            if(temp == 1){
                if(nums[i] > nums[i+1]){
                        return false;
                }
            }else if(temp == -1){
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
