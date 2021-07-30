public String missingChar(String str, int n) {
    int i;
    String res="";
    for(i=0;i<str.length();i++){
      if(i!=n)
        res=res+str.charAt(i)+"";
    }
    return res;
}  