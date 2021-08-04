public boolean lastDigit(int a, int b) {
  int first=a%10;
  int second=b%10;
  if(first==second)
    return true;
  else
    return false;
}