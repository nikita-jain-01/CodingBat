public static String everyNth(String str, int n) {
    String res="";
    for(int i=0;i<str.length();i=i+n)
      res=res+str.charAt(i)+"";
    return res;
}