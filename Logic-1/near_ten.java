public boolean nearTen(int num) {
    if(num%10==0 || (num-2)%10==0 || (num-1)%10==0 || (num+2)%10==0 || (num+1)%10==0)
      return true;
    return false;
}