public boolean mixStart(String str) {
  if(str.length()>=3){
    if(str.charAt(1)=='i' && str.charAt(2)=='x')
      return true;
  }
  return false;
}