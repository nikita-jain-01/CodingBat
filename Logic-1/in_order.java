public boolean inOrder(int a, int b, int c, boolean bOk) {
    if((b>a && c>b) || (c>b && bOk==true))
      return true;
    return false;
}