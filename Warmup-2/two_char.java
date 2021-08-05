public String twoChar(String str, int index) {
    if(str.length()>=2){
      if(index<=str.length()-2 && index>=0)
        return str.charAt(index)+""+str.charAt(index+1)+"";
      else
        return str.charAt(0)+""+str.charAt(1)+"";
    }
    return str;
}