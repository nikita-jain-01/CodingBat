public boolean lastDigit(int a, int b, int c) {
  int f=a%10;
  int s=b%10;
  int t=c%10;
  if(f==s || s==t || f==t)
    return true;
  else
    return false;
}