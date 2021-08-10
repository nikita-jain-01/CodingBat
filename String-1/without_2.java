public String without2(String str) {
    String res="";
    if(str.length()>=4){
      if(str.charAt(0)==str.charAt(str.length()-2) && str.charAt(1)==str.charAt(str.length()-1)){
        for(int i=2;i<str.length();i++)
          res=res+str.charAt(i)+"";
        return res;
      }
      return str;
    }
    else if(str.length()==3)
      return str.charAt(0)+"";
    else if(str.length()==2)
      return "";
    else
      return str;
}