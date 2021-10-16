var shuffle = function(nums, n) {
    let res =[];
    let j=n;
    for(let i=0;i<n;i++){
        res.push(nums[i]);
        res.push(nums[j]);
        j++;
    }
    return res;
};