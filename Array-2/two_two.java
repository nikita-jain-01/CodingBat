public static boolean twoTwo(int[] nums) {
    int k=0,i;
    if(nums.length>=2){
      for(i=0;i<nums.length-1;i++){
        if(nums[i]==2 && nums[i+1]==2)
        {
          k=0;
          i++;
        }
        else if(nums[i]==2 && nums[i+1]!=2)
        {
          k=1;
          return false;
        }
      }
      if(nums[nums.length-1]==2 && nums[nums.length-2]!=2)
        return false;
    }
    else if(nums.length>=1){
      if(nums[0]==2)
      return false;
    }
    return true;
}  