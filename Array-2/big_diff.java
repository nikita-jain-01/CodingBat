public static int bigDiff(int[] nums) {
    int min,max,i;
    min=nums[0];
    max=nums[0];
    for(i=0;i<nums.length;i++){
      if(max<nums[i])
      max=nums[i];
      if(min>nums[i])
      min=nums[i];
    }
    return (max-min);
}