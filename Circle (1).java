
public class Circle 
{
	
	private double radius;
	private final double pi=3.14;
	
	public void setRadius(double r)
	{
		radius=r;
	}
    public double Area()
    {
    	return pi*radius*radius;
    }
    public static void main(String args[])
    {
    	Circle c=new Circle();
    	c.setRadius(2);
    	System.out.println(c.Area());
    }
}
