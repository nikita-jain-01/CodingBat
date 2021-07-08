/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are 
on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

Input :-
        sleepIn(false, false)
        sleepIn(true, false)
        sleepIn(false, true)

Output :- 
        true
        false
        true
*/


public boolean sleepIn(boolean weekday, boolean vacation) {
  if(weekday==false || vacation==true)
    return true;
  else
    return false;
}