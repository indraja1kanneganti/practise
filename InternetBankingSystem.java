class Account    // the 'monitor'
{
	int balance;

// if 'synchronized' is removed, the outcome is unpredictable
public  void deposit(int  deposit_amount) {
	balance += deposit_amount;
	}

public  void withdraw(int  deposit_amount) {
	balance -= deposit_amount;
	}

public  void enquire( ) {
	System.out.println(balance);
	}
}

class MyThread implements Runnable
{
	Account account;
public MyThread (Account s) {
	account = s;
	}
public void run() {
	account.deposit(10000);
	}
} // end class MyThread

class YourThread implements Runnable
{
	Account account;
public YourThread (Account s) {
	account = s;
	}
public void run() {
	account.withdraw(2000);
	}
} // end class YourThread

class HerThread implements Runnable
{
	Account account;
public HerThread (Account s) {
	account = s;
	}
public void run() {
	account.enquire();
	}
} // end class HerThread

class InternetBankingSystem
{
public static void main(String [] args)
{
	Account ao = new Account ();
	Thread t1 = new Thread(new MyThread(ao));
	Thread t2 = new Thread(new YourThread(ao));
	Thread t3 = new Thread(new HerThread(ao));
	t1.start();
	t2.start();
	t3.start();
}
}