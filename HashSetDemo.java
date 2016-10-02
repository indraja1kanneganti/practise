// example on Sets (HashSet)
import java.util.HashSet;

public class HashSetDemo
{
public static void main(String args[])
{
	HashSet <String> hset = new HashSet<String>();
	hset.add("nokia");
	hset.add("lg");
	hset.add("htc");
	hset.add("apple");
	hset.add("sony");
	hset.add("lg");
	for(String s : hset ) {
		System.out.println(s);
	}
}
}