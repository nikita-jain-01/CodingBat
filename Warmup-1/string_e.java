public public boolean stringE(String str) {
    int i,count=0;
    for(i=0;i<str.length();i++){
      if(str.charAt(i)=='e')
        count++;
    }
    if(count==3 || count==1)
      return true;
    return false;
}