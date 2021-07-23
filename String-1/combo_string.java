public String comboString(String a, String b) {
    if(b.length()<a.length())
    return b+""+a+""+b;
    else
    return a+""+b+""+a;
}