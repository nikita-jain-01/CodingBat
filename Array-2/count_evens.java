public static int countEvens(int[] nums) {
    int count=0,i;
    for(i=0;i<nums.length;i++){
        if(nums[i]%2==0)
            count++;
    }
    return count;
}