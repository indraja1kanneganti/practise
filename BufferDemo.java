// showing to read your name dynamically from keyboard with BufferedReader class readLine().

import java . io . *;

class BufferDemo
{
public static void main(String args [])
{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try {
		System.out.println("enter the name & age:");
		String name = br.nextLine();
		System.out.println("hi " + name );
		} catch(Exception e)
		{
			System.out.println(e);
			}
}
}