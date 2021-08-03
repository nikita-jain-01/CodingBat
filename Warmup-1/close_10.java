public int close10(int a, int b) {
    int first=0,second=0;
    if(a>=10)
      first=a-10;
    else
      first=10-a;
    if(b>=10)
      second=b-10;
    else
      second=10-b;
    if(first<second)
      return a;
    else if(second<first)
      return b;
    return 0;
}