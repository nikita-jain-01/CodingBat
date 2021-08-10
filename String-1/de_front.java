public String deFront(String str) {
    String res="";
    if(str.length()>=2){
      if(str.charAt(0)=='a')
        res=res+str.charAt(0)+"";
      if(str.charAt(1)=='b')
        res=res+str.charAt(1)+"";
      for(int i=2;i<str.length();i++)
        res=res+str.charAt(i)+"";
      return res;
    }
    else
      return str;
}