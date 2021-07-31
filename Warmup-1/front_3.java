public String front3(String str) {
  int i,j;
  String res="";
  if(str.length()>=3){
    for(j=1;j<=3;j++){
      for(i=0;i<3;i++)
        res=res+str.charAt(i);
    }
    return res;
  }
  else{
    return str+""+str+""+str+"";
  }
}