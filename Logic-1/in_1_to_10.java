public boolean in1To10(int n, boolean outsideMode) {
    if(outsideMode==false){
      if(n>=1 && n<=10)
        return true;
      else
        return outsideMode;
    }
    else{
      if(n<=1 || n>=10)
        return true;
      else
        return false;
    }
}