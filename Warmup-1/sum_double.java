/*
 * Given two int values, return their sum. Unless the two values are the same,
 * then return double their sum.
 * 
 * Input :- 
 *          sumDouble(1, 2)
 *          sumDouble(3, 2)
 *          sumDouble(2, 2)
 * 
 * Output :- 3 
 *           5
 *           8
 */


public int sumDouble(int a, int b) {
    int sum=0;
    if(a!=b)
        sum=(int)(a+b);
    else
        sum=(int)(2*(a+b));
    return sum;
}