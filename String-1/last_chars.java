public String lastChars(String a, String b) {
    if(a.length()>=1 && b.length()>=1)
      return a.charAt(0)+""+b.charAt(b.length()-1)+"";
    else if(a.length()<1 && b.length()<1)
      return "@@";
    else if(a.length()<1)
      return "@"+b.charAt(b.length()-1)+"";
    else
      return a.charAt(0)+"@";
}