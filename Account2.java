package JavaOO;

public class Account2 {
	private String owner;
	private long balance;

	public Account2(String owner) {
		this.owner = owner;
	}

	public Account2(long balance) {
		this.balance = balance;
	}

	public Account2(String owner, long balance) {
		this(owner);
		this.balance = balance;
	}

	// getter와 setter구현
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		return this.balance -+amount;
	}

	public static void main(String[] args) {
		Account2 act = new Account2("나효정", 100000);
		act.deposit(1000000);
		act.withdraw(500000);
		act.deposit(200000);
		act.withdraw(200000);
		System.out.printf("%d %n",act.getBalance());

	}

}
