public String seeColor(String str) {
    if(str.length()>=4){
      if(str.charAt(0)=='b' && str.charAt(1)=='l' && str.charAt(2)=='u' && str.charAt(3)=='e')
        return "blue";
      if(str.charAt(0)=='r' && str.charAt(1)=='e' && str.charAt(2)=='d')
        return "red";
    }
    else if(str.length()>=3){
      if(str.charAt(0)=='r' && str.charAt(1)=='e' && str.charAt(2)=='d')
        return "red";
    }
    return "";
}  