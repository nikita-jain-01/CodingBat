public static String stringSplosion(String str) {
  String res="";
  for(int i=0;i<str.length();i++){
    for(int j=0;j<=i;j++){
      res=res+str.charAt(j)+"";
    }
  }
  return res;
}