public String withouEnd2(String str) {
    String res="";
    if(str.length()>2){
      for(int i=1;i<str.length()-1;i++)
        res=res+str.charAt(i)+"";
    }
    return res;
}