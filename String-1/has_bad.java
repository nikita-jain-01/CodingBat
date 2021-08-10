public boolean hasBad(String str) {
  if(str.length()>=4){
    if(str.charAt(0)=='b' && str.charAt(1)=='a' && str.charAt(2)=='d')
      return true;
    else if(str.charAt(1)=='b' && str.charAt(2)=='a' && str.charAt(3)=='d')
      return true;
  }
  else if(str.length()>=3){
    if(str.charAt(0)=='b' && str.charAt(1)=='a' && str.charAt(2)=='d')
      return true;
  }
  return false;
}