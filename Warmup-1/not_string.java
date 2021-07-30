public String notString(String str) {
    if(str.length()>=3)
    {
      if(str.charAt(0)=='n' && str.charAt(1)=='o' && str.charAt(2)=='t')
      return str;
    }
    return "not "+str;
}  