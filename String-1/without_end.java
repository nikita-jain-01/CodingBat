public String withoutEnd(String str) {
    int i;
    String res="";
    for(i=1;i<str.length()-1;i++)
      res=res+str.charAt(i)+"";
    return res;
}