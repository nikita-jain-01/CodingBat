public static boolean sum28(int[] nums) {
  int count=0,i;
  for(i=0;i<nums.length;i++){
    if(nums[i]==2)
      count=count+nums[i];
  }
  if(count==8)
    return true;
  else
    return false;
}