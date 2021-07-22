public String firstHalf(String str) {
    String res="";
    int l=str.length();
    l=l/2;
    for(int i=0;i<l;i++)
      res=res+str.charAt(i)+"";
    return res;
}