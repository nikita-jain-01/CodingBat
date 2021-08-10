public String withoutX(String str) {
  String res="";
  if(str.length()>=1){
    if(str.charAt(0)!='x')
      res=res+str.charAt(0);
      for(int i=1;i<str.length()-1;i++){
        res=res+""+str.charAt(i)+"";
      }
      if(str.charAt(str.length()-1)!='x')
        res=res+str.charAt(str.length()-1);
    return res;
  }
  return str;
}