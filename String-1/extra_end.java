public String extraEnd(String str) {
    int i;
    String res="";
    for(i=1;i<=3;i++)
      res=res+""+str.charAt(str.length()-2)+""+str.charAt(str.length()-1)+"";
    return res;
  }