
/**
 * Write a description of class Calculation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculation
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    /**
     * Constructor for objects of class Calculation
     */
    public Calculation()
    {
        // initialise instance variables
        x = 0;
        y= 0;
    }
    
    public static void main(String args[]){
        Calculation newCalc = new Calculation();
        newCalc.setX(1);
        newCalc.setY(2);
        System.out.println(newCalc.avg());
        System.out.println(newCalc.max());
        newCalc.quadratic(3.0,6.0,3.0);
        System.out.println(newCalc.getX());
        System.out.println(newCalc.getY());
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int hoursInWeek()
    {
        // put your code here
        return 24 * 7;
    }
    
    public int secondsInYear()
    {
        // put your code here
        return 52*hoursInWeek()*60*60;
    }
    
    public double avg() {
        return (x+y)/2;
    }
    
    public double max() {
        if (x>y) {
            return x;
        } else {
            return y;
        }
    }
    
    public void swap() {
        double temp = x;
        x = y;
        y = temp;
    }
    
    public void quadratic(double a, double b, double c){
        x = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        y = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        System.out.println(x);
        System.out.println(y);
    }
    
    public void setX(double value){
        x = value;
    }

    public void setY(double value){
        y = value;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}
