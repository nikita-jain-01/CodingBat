public boolean frontAgain(String str) {
    if(str.length()>=4){
      if((str.charAt(0)==str.charAt(str.length()-2)) && (str.charAt(1)==str.charAt(str.length()-1)))
        return true;
      else
        return false;
    }
    else if(str.length()<=1)
      return false;
    return true;
}