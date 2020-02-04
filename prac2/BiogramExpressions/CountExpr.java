
/**
 * A simple class to apply a transformation iteratively
 * 
 * @author Steven Bradley
 */
public class CountExpr
{
  
    private double x;
    public double y;
    
    public CountExpr(int startx, int starty){
         x=startx/15.0;
        y=starty/15.0;
    }
    
    public void doOnce(){
        y=(x-25)*Math.tan(y/2) - (y-30)*Math.tan(x/2);
    }
    
    public boolean finished(){
            return x+y>100; 
    }
}
