// example on TreeSet
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo
{
public static void main(String args[])
{
	int n[] = {23, 98, 45, 10, 56, 83, 23, 45};

	Set <Integer> hset = new HashSet<Integer>();
		//			OR
		//HashSet <Integer> set = new HashSet<Integer>();
	for(int i=0; i<n.length; i++) {
		hset.add(n[i]);
		}
 	System.out.println("HashSet Data	:" + hset);

  	TreeSet<Integer> tset =new TreeSet<Integer>(hset);
	//		OR
	//tset.addAll(hset);
  	System.out.println("The sorted list is:");
  	System.out.println("TreeSet Data	:" + tset);

  	System.out.println("1st	:" + tset.first() );
  	System.out.println("last	:" + tset.last() );
}
}

/*
Note:
This program creates a HashSet and adds a group of numbers,
including a number "22" twice.
The program than prints out the list of numbers in the set, note
that the duplicate number is not added to the set. Then the
program treats the set as a TreeSet and displays the sorted list
of the set.
The first( ) and the last( ) methods display the first
& last elements of the set respectively. */