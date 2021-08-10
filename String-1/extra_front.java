public String extraFront(String str) {
    String res="";
    if(str.length()>2){
      for(int i=1;i<=3;i++)
        res=res+str.charAt(0)+""+str.charAt(1)+"";
      return res;
    }
    return str+str+str;
}