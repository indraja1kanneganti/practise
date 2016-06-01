
public class Box 
{
  private double length,breadth,height;
  
  
  public Box(double l,double b,double h)
  {
	  length=l;
	  breadth=b;
	  height=h;
  }
  /*
  public void setLength(double l)
  {
	  length=l;
  }
  public void setBreadth(double b)
  {
	  breadth=b;
  }
  public void setHeight(double h)
  {
	  height=h;
  }
  */
  public double volume()
  {
	  return length*breadth*height;
  }
  public static void main(String args[])
  {
	  Box b=new Box(10,20,20);
	  //b.setLength(10);
	  //b.setHeight(20);
	  //b.setBreadth(20);
	  System.out.println(b.volume());
	  
  }
}
