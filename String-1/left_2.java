public String left2(String str) {
    String res="";
    int i;
    if(str.length()>2){
      for(i=2;i<str.length();i++)
        res=res+str.charAt(i)+"";
    }
    if(str.length()>=1)
      res=res+str.charAt(0)+"";
    if(str.length()>=2)
      res=res+str.charAt(1)+"";
    return res;
}