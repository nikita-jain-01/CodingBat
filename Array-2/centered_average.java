public static int centeredAverage(int[] nums) {
    int min,max,i,sum=0,count=0,x=0,y=0;
    min=nums[0];
    max=nums[0];
    for(i=0;i<nums.length;i++){
      if(max<nums[i])
      {
        max=nums[i];
        x=i;
      }
      if(min>nums[i])
      {
        min=nums[i];
        y=i;
      }
    }
    for(i=0;i<nums.length;i++){
      if(i!=x && i!=y){
        sum=sum+nums[i];
        count++;
      }
    }
    return (sum/count);
}