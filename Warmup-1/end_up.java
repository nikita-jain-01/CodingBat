public String endUp(String str) {
    String res="";
    String last="";
    if(str.length()>=3){
      for(int i=0;i<str.length()-3;i++){
        res=res+str.charAt(i)+"";
      }
      last=str.charAt(str.length()-3)+""+str.charAt(str.length()-2)+""+
      str.charAt(str.length()-1)+"";
      last=last.toUpperCase();
      return res+""+last+"";
    }
    return str.toUpperCase();
}