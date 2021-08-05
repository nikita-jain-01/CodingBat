boolean doubleX(String str) {
    int k=0;
    if(str.length()>1){
      for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i)=='x' && str.charAt(i+1)=='x')
        {
          i++;
          k=1;
        }
        else if(str.charAt(i)=='x' && str.charAt(i+1)!='x')
          return false;
      }
    }
    if(k==1)
      return true;
    return false;
}  