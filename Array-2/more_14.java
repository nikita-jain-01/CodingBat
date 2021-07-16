public static boolean more14(int[] nums) {
    int count1=0,count4=0,i;
    for(i=0;i<nums.length;i++){
      if(nums[i]==1)
        count1++;
      if(nums[i]==4)
        count4++;
    }
    if(count1>count4)
      return true;
    else
      return false;
}  