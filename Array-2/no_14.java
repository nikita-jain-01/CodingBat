public static boolean no14(int[] nums) {
    int i,x=0,y=0;
    for(i=0;i<nums.length;i++){
      if(nums[i]==1)
      {
        x=1;
        break;
      }
    }
    for(i=0;i<nums.length;i++){
      if(nums[i]==4)
      {
        y=1;
        break;
      }
    }
    if(x==1 && y==1)
      return false;
    else
      return true;
}