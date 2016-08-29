// program  showing two threads action on same object

class Reserve extends Thread
{
     int available=5;
     int wanted;
// accept wanted bearths @ runtime
public Reserve(int i)
{
  wanted=i;
  }
public void run()
{
  System.out.println("Available Bearths = "+available);
  if(available>=wanted) {
       //get the name of passenger
       String name=Thread.currentThread().getName();
       // allot the breath to him
       System.out.println(wanted+" Bearths Reserved for "+ name);
       try {
              Thread.sleep(1000);
	// waiting for printing Ticket
              available=available-wanted;
       	//update the no.of bearths available
              }catch(Exception e) { }
  }
  else {   // if available bearths is less, display error msg
       System.out.println("Sorry! No Breaths");
  }
 }
}

public class threadtest12
{
public static void main(String args[])
{
Reserve ob=new Reserve(4);
	//wants 1 bearth
Thread t1=new Thread(ob);
Thread t2=new Thread(ob);

t1.setName("Shiva");	// take thread name as a persons name
t2.setName("Kumar");

// sending request for bearth reserve
t1.start();
t2.start();
}
}