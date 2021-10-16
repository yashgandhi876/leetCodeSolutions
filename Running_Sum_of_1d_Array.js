var runningSum = function(nums) {
    var total = nums[0];
      for(var i=1; i<nums.length;i++){
          nums[i] += total;
          total = nums[i];
      }
    return nums;
};
