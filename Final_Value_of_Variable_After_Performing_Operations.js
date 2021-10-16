var finalValueAfterOperations = function(operations) {
    let res=0;
    
    for(let i=0;i<operations.length;i++){
        operations[i].charAt(1) == '+'? res++ : res--;    
    }
    
    return res;
    
};