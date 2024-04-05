import java.text.DecimalFormat;

/**
 * This class illustrates using some Java best practices. Here's a list of good practices:
 *
 * 1) This class represents a glob of information. In order to share this information safely across 
 *    concurrent operations the data is immutable.
 * 2) Instead of static addTime method we use instance method add which returns a new immutable instance.
 * 3) Instead of static printTime method we override the toString method
 * 4) Time has a natural ordering that is consistently used. So we can implement the Comparable interface
 *     which defines one method ... compareTo.
 * 5) We adjust the hour, minute and second variables so that seconds and minutes fall into the expected ranges of
 *    0 <= x < 60. Actually (we're not adjusting for negative values)
 */
public class BetterTime implements Comparable<BetterTime> {
  
  private int hour;
  private int minute;
  private double second;
  private static final DecimalFormat df = new DecimalFormat("00.##");
  
  public BetterTime() {
    this(0, 0, 0);
  }
  
  public BetterTime(int hour, int minute, double second) {
    this(toSeconds(hour, minute, second));
  }

  public BetterTime(double seconds) {
    fromSeconds(seconds);
  }
  
  public int getHour() {
    return hour;
  }
  
  public int getMinute() {
    return minute;
  }
  
  public double getSecond() {
    return second;
  }

  private void fromSeconds(double seconds) {
    this.hour = (int) (seconds / 3600D);
    seconds -= this.hour * 3600D;
    this.minute = (int) (seconds / 60D);
    seconds -= this.minute * 60D;
    this.second = seconds;
  }
  
  public static double toSeconds(int hour, int minute, double second) {
    return ((hour * 60) + minute) * 60 + second;
  }

  public double toSeconds() {
    return toSeconds(hour, minute, second);
  }
  
  @Override
  public String toString() {
    return String.format("%02d:%02d:%s", hour, minute, df.format(second));
  }
  
  @Override
  public int compareTo(BetterTime that) {
    double diff = that.toSeconds() - this.toSeconds(); 
    if (diff < 0) return -1;
    else if (diff > 0) return 1;
    else return 0;
  }
  
  public BetterTime add(BetterTime t) {
    return new BetterTime(hour + t.getHour(), 
        minute + t.getMinute(), 
        second + t.getSecond());
  }
  
  public static void main(String[] args) {
    System.out.println("new BetterTime(1, 2, 3.0001) -> " + new BetterTime(1, 2, 3.0001));
    System.out.println("new BetterTime(0, 0, 61)     -> " + new BetterTime(0, 0, 61));
    System.out.println("new BetterTime(0, 80, 0)     -> " + new BetterTime(0, 80, 0));
    BetterTime a = new BetterTime(1, 1, 0);
    BetterTime b = new BetterTime(0, 0, 30);
    System.out.println("(new BetterTime(1, 1, 0)).add(new BetterTime(0, 0, 30)) -> " + a.add(b));
    System.out.println("a.compareTo(b) -> " + a.compareTo(b));
    System.out.println("b.compareTo(a) -> " + b.compareTo(a));
    System.out.println("a.compareTo(a) -> " + a.compareTo(a));
  }
}