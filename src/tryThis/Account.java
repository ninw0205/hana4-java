package tryThis;

public class Account {
	private String id;
	private String name;
	private int balance = 0;

	public Account() {
	}

	public Account(String id, String name, int balance) {
		this(id, name);
		this.balance = balance;
	}

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int deposit(int amount) {
		return balance += amount;
	}

	public int withdraw(int amount) {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.println("출금액이 잔액초과");
		return balance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			// balance -= amount;
			// another.balance += amount;
			return this.withdraw(amount) - another.deposit(amount);
		} else
			System.out.println("송금액이 잔액초과");
		return balance;
	}

	@Override
	public String toString() {
		return "Account{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			", balance=" + balance +
			'}';
	}

	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		accounts[0] = new Account("11-111-1111", "코난", 20000);
		accounts[1] = new Account("22-222-2222", "장미", 100000);
		accounts[2] = new Account("33-333-3333", "미란", 50000);

		for (Account account : accounts) {
			System.out.println(account);
		}

		System.out.println("-".repeat(30));
		accounts[0].transferTo(accounts[1], 30000);
		accounts[0].deposit(50000);
		accounts[0].transferTo(accounts[1], 30000);
		accounts[2].withdraw(4500);

		for (Account account : accounts) {
			System.out.println(account);
		}

	}
}
