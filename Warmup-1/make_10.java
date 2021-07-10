/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

Input :-
        makes10(9, 10)
        makes10(9, 9)
        makes10(1, 9)

Output :-
        true
        false
        true
*/


public boolean makes10(int a, int b) {
    if(a==10 || b==10 || (a+b)==10)
        return true;
    else
        return false;
}