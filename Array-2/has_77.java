public static boolean has77(int[] nums) {
    int i,x,y;
    for(i=0;i<nums.length-2;i++){
      x=nums[i+1];
      y=nums[i+2];
      if((nums[i]==7 && x==7) || (nums[i]==7 && y==7) || (x==7 && y==7))
        return true;
    }
    return false;
}  