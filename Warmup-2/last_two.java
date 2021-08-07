public String lastTwo(String str) {
    String res="";
    for(int i=0;i<str.length()-2;i++){
      res=res+str.charAt(i)+"";
    }
    if(str.length()>=2)
      res=res+str.charAt(str.length()-1)+""+str.charAt(str.length()-2)+"";
    else
      res=res+str+"";
    return res;
}