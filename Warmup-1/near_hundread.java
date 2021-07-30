public boolean nearHundred(int n) {
    int dif=0;
    if(n<=100)
      dif=100-n;
    else if(n<=110)
      dif=110-n;
    else if(n<=200)
      dif=200-n;
    else if(n<=210)
      dif=210-n;
    else
      dif=400-n;
    if(dif<=10)
      return true;
    else
      return false;
}