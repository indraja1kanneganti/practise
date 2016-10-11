// example on Data Reading & Writing
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.EOFException;

public class DataStreams2
{
    static final String dataFile = "billingdata";
	static final String[] items = { "CD", "DVD", "PenDrive", "MicroSD 1GB", "MicroSD 2GB" };
    static final int[] qty = { 16, 2, 8, 11 , 10 };
    static final double[] prices = { 1.00, 2.59, 5.60, 10.99, 20.99 };


public static void main(String[] args) throws IOException
{
	// Data Writing into File
	DataOutputStream dos = null;

	try {
		dos = new DataOutputStream(new
                    BufferedOutputStream(new FileOutputStream(dataFile)));

		for (int i = 0; i < prices.length; i ++) {
			dos.writeDouble(prices[i]);
			dos.writeInt(qty[i]);
			dos.writeUTF(items[i]);
		}
	} finally {
		dos.close();
	}

	// Data Reading From File
	DataInputStream dis = null;
	double total = 0.0;
	try {
		dis = new DataInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));
		double p;
		int q;
		String i;
		try {
			System.out.printf("%-15s%10s%10s%10s\n", "Item", "Qty", "Price", "Amount");
			System.out.printf("%-15s%10s%10s%10s\n", "----------", "---------", "---------", "---------");
			while (true) {
				p = dis.readDouble();
				q = dis.readInt();
				i = dis.readUTF();

				System.out.printf("%-15s%10d%10.2f%10.2f\n", i, q, p, q*p);
				total += q * p;
			}
		} catch (EOFException e) { }
			System.out.format("\t\t\t\tTOTAL: $%.2f%n", total);
		} finally {
			dis.close();
		}
}
}