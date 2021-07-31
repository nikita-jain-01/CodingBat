public String front22(String str) {
    if(str.length()>=2){
        return str.charAt(0)+""+str.charAt(1)+""+str+""+str.charAt(0)+""+str.charAt(1)+"";
      }
    return str+""+str+""+str+"";
}