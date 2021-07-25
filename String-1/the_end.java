public String theEnd(String str, boolean front) {
    if(str.length()>=1){
      if(front==true)
        return str.charAt(0)+"";
      else
        return str.charAt(str.length()-1)+"";
    }
    return "";
}