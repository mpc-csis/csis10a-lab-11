
/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time
{
    int hour;
    int minute;
    double second;
    
    // add the no-arg constructor here
    
    // add the overloaded constructor here
    
    
    public static void printTime(Time t) { 
        // complete the method definition
    }    
    
    public static String add0(int n){
        if (n < 10){
            return "0" + n;
        }
        return "" + n;
    }
    
    public static void main(String [] args){
        Time t = new Time();  // uses the no-arg construct
        System.out.println("t = " + t.hour + ":" + t.minute + ":" + t.second);        
        // printTime(t);
        // demo the overloaded constructor here
        
        
    }

/*
 public static boolean isAfter(Time time1, Time time2) {
     if (time1.hour > time2.hour) return true; 
     if (time1.hour < time2.hour) return false; 
     if (time1.minute > time2.minute) return true; 
     if (time1.minute < time2.minute) return false; 
     if (time1.second > time2.second) return true; 
     return false; }
 
 public static Time addTime(Time t1, Time t2) {
     Time sum = new Time(); 
     sum.hour = t1.hour + t2.hour; 
     sum.minute = t1.minute + t2.minute; 
     sum.second = t1.second + t2.second; 
     return sum; 
 } 

  Time currentTime = new Time(9, 14, 30.0); 
  Time breadTime = new Time(3, 35, 0.0); 
  Time doneTime = addTime(currentTime, breadTime);
  printTime(doneTime);

 
 */
}