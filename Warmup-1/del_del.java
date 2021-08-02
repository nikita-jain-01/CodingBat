public String delDel(String str) {
    String res="";
    int i;
    if(str.length()>3){
      res=str.charAt(0)+"";
      if(str.charAt(1)=='d' && str.charAt(2)=='e' && str.charAt(3)=='l'){
        for(i=4;i<str.length();i++)
          res=res+str.charAt(i)+"";
        return res;
      }
    }
    return str;
}