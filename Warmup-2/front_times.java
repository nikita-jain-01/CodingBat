public static String frontTimes(String str, int n) {
    String res="";
    if(str.length()>=3){
      for(int i=1;i<=n;i++)
        res=res+str.charAt(0)+str.charAt(1)+str.charAt(2)+"";
      return res;
    }
    else{
      for(int i=1;i<=n;i++)
        res=res+str+"";
      return res;
    }
}