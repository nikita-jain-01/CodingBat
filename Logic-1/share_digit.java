public static boolean shareDigit(int a, int b) {
    int f,s;
    while(a!=0){
      int temp=b;
      f=a%10;
      while(temp!=0){
        s=temp%10;
        if(f==s)
          return true;
        temp=temp/10;
      }
      a=a/10;
    }
    return false;
}