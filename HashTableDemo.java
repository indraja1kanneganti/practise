// example on Hashtable
import java.util.*;
class HashTableDemo
{
public static void main(String args[])
{
Hashtable <String, Double> balance = new Hashtable<String, Double>();
String str;
double bal;
balance.put("Shiva", 3434.34);
balance.put("Kumar", 123.22);
balance.put("Radhi", 1378.00);
balance.put("Pinky", 99.22);
balance.put("Swetha", -19.08);

// show all balances in hashtable
Set set = balance.keySet(); // get set-view of keys
// get iterator
Iterator itr = set.iterator();
while(itr.hasNext()) {
	str = (String) itr.next();
	System.out.println(str + ": " + balance.get(str));
	}

System.out.println();
// Deposit 1,000 into kumar's account
bal = balance.get("Kumar");
balance.put("Kumar", bal+1000);
System.out.println("Kumar's new balance: " +balance.get("Kumar"));

System.out.println("contains Radhi key  : "+ balance.containsKey("Radhi") );
System.out.println("contains remo key  : "+ balance.containsKey("remo") );
System.out.println("Size   : " +balance.size());
System.out.println(balance);
}
}