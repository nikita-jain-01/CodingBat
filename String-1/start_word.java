public String startWord(String str, String word) {
    String res="";
    int k=0;
    if(str.length()>=word.length()){
      for(int i=1;i<word.length();i++){
        if(str.charAt(i)!=word.charAt(i)){
          k=1;
          break;
        }
      }
      if(k==0){
        for(int i=0;i<word.length();i++)
          res=res+""+str.charAt(i)+"";
        return res;
      }
    }
    return "";
}  