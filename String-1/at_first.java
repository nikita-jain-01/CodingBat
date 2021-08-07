public String atFirst(String str) {
    if(str.length()>=2)
      return str.charAt(0)+""+str.charAt(1)+"";
    else if(str.length()==1)
      return str+"@";
    else
      return "@@";
}