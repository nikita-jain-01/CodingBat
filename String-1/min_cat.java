public String minCat(String a, String b) {
    int x;
    String res="";
    if(a.length()>b.length()){
      x=a.length()-b.length();
      for(int i=x;i<a.length();i++)
        res=res+a.charAt(i)+"";
      res=res+""+b+"";
      return res;
    }
    else if(b.length()>a.length()){
      x=b.length()-a.length();
      res=res+""+a+"";
      for(int i=x;i<b.length();i++)
        res=res+b.charAt(i)+"";
      return res;
    }
    else
      return a+""+b+"";
}  