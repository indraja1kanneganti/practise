// example on method over-loading
import static java.lang.System.out;

class Person
{
    private String fname;
    private String lname;

public void setName(String fn, String ln)  {
        fname=fn;
        lname=ln;
    }

public void setName(String fn)  {
        fname=fn;
        lname="";
    }

public String toString()  {
        return(fname+" "+lname);
    }
}

public class testclass8
{
public static void main(String[] args)
{
Person p=new Person();
p.setName("rama", "rao");
out.println("Name	:"+ p);

p = new Person();
p.setName("Shiva");
out.println("Name	:"+ p.toString() );
}
}