public String right2(String str) {
    String res="";
    int i;
    if(str.length()>2){
      res=res+str.charAt(str.length()-2)+""+str.charAt(str.length()-1)+"";
      for(i=0;i<str.length()-2;i++)
        res=res+str.charAt(i)+"";
      return res;
    }
    else
      return str;
}