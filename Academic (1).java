
public class Academic extends Personal
{
	String standard,university;
	
	public Academic(String a,String u,String name,String g,int ag)
	{
		super(name,g,ag);
		standard=a;
		university=u;
		
	}

	public String getStandard() 
	{
		return standard;
	}
/*
	public void setStandard(String standard) 
	{
		this.standard = standard;
	}
	*/

	public String getUniversity() 
	{
		return university;
	}
/*
	public void setUniversity(String university) 
	{
		this.university = university;
	}
	*/
	
    public static void main(String args[])	
    {
    	Academic a=new Academic("B.tech","JNTU","rakesh","male",42);
    	
    	System.out.println(a.getName());
    	System.out.println(a.getAge());
    	System.out.println(a.getGender());
    	System.out.println(a.getStandard());
    	System.out.println(a.getUniversity());
    }

}
