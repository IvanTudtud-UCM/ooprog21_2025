public class DebugCircle
{
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r)
    {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    //  removed semicolon after the parameter 
    public int getRadius()
    {
        return radius; //fixed the spelling from radiuss to radius 
    }

    // changed return type from void to int 
    public int getDiameter()
    {
        return diameter;
    }

    public double getArea()
    {
        return area;
    }
}
