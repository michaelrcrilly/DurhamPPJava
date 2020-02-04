
/**
 * Level 1 step 5 - come up with your own CountExpr class
 *
 * @author Michael Crilly
 */
public class MyCountExpr
{
    private double x;
    public double y;
    
    public MyCountExpr(int initialX, int initialY){
        x = initialX / 10.0;
        y = initialY / 10.0;
    }
    
    public void doOnce(){
        y = x*Math.tan(y/2);
    }
    
    public boolean finished(){
        if (x+y > 100) {
            return true;
        } else {
            return false;
        }
        // Could just return (x+y>100) but good to cover actual statement syntax
    }
}
