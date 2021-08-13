public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if((a<b && b<c && a<c && equalOk==false) || (a<=b && b<=c && a<=c && equalOk==true))
      return true;
    return false;
}