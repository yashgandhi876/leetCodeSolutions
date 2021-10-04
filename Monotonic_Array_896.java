class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 2){
        if (nums.length < 2) {
            return true;
        }
        int temp = 0;

        for(int i = 0; i<nums.length-1; i++){
            if(temp == 0){
                if(nums[i] < nums[i+1]){
        for (int i = 0; i < nums.length - 1; i++) {
            if (temp == 0) {
                if (nums[i] < nums[i + 1]) {
                    temp = 1;
                }else if(nums[i] > nums[i+1]){
                } else if (nums[i] > nums[i + 1]) {
                    temp = -1;
                }
            }

            if(temp == 1){
                if(nums[i] > nums[i+1]){
            if (temp == 1) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }else if(temp == -1){
                if(nums[i] < nums[i+1]){
            } else if (temp == -1) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }}

public class Monotonic_Array_896{

    public static void main(String args[]){
        Solution solution = new Solution();
        int arr[] = {1,2,2,3,4,5};
        solution.isMonotonic(arr);
    }

}  
