public String withoutX2(String str) {
  String res="";
  if(str.length()>=1){
    if(str.charAt(0)!='x')
      res=res+str.charAt(0)+"";
  }
  if(str.length()>=2){
    if(str.charAt(1)!='x')
      res=res+str.charAt(1)+"";
  }
  if(str.length()>=3){
    for(int i=2;i<str.length();i++)
      res=res+str.charAt(i)+"";
  }
  return res;
}