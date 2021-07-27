public static int countX(String str) {
    int i,count=0;
    for(i=0;i<str.length();i++){
      if(str.charAt(i)=='x')
        count++;
    }
    return count;
}