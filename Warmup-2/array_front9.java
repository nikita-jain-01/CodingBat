public boolean arrayFront9(int[] nums) {
    if(nums.length>=4){
      for(int i=0;i<4;i++){
        if(nums[i]==9)
          return true;
      }
    }
    else if(nums.length>=1){
      for(int i=0;i<nums.length;i++){
        if(nums[i]==9)
          return true;
      }
    }
    return false;
}