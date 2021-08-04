public String nTwice(String str, int n) {
  String res="";
  if(str.length()>=n){
    for(int i=0;i<n;i++){
      res=res+str.charAt(i)+"";
    }
    for(int i=str.length()-n;i<str.length();i++){
      res=res+str.charAt(i)+"";
    }
  }
  return res;
}