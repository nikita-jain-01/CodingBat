public String stringBits(String str) {
    String res="";
    for(int i=0;i<str.length();i=i+2){
      res=res+str.charAt(i)+"";
    }
    return res;
}