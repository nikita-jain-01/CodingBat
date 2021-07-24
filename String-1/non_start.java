public String nonStart(String a, String b) {
    String res="";
    int i;
    if(a.length()>1 || b.length()>1){
      for(i=1;i<a.length();i++)
        res=res+a.charAt(i)+"";
      for(i=1;i<b.length();i++)
        res=res+b.charAt(i)+"";
    }
    return res;
}  