public static int sum13(int[] nums) {
    int sum=0,i;
    for(i=0;i<nums.length;i++){
      if(nums[i]==13)
        i++;
      else
        sum=sum+nums[i];
    }
    return sum;
}
