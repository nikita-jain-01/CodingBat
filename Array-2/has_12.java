public static boolean has12(int[] nums) {
    int i,x=0;
    for(i=0;i<nums.length;i++){
      if(nums[i]==1)
        x=1;
      if(nums[i]==2 && x==1)
        return true;
    }
    return false;
}