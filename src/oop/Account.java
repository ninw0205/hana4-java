package oop;

import java.util.Scanner;

public class Account {
	private int accountNo;
	private String name;
	private double balance;

	private Scanner scanner;

	private final Account[] accounts = new Account[3];

	public void initialize() {
		accounts[0] = new Account(1, "코난", 100000);
		accounts[1] = new Account(2, "장미", 100000);
		accounts[2] = new Account(3, "미란", 100000);
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public Account() {

	}

	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNo, String name) {
		this(accountNo, name, 0);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double transferTo(Account another, double amount) {
		if (amount <= balance) {
			balance -= amount;
			another.balance += amount;
			// return this.withdraw(amount) - another.deposit(amount);
		} else
			System.out.println("송금액이 잔액초과");

		this.checkBalance();
		another.checkBalance();
		return balance;
	}

	public void selectAccount() {
		if (scanner == null)
			this.start();

		System.out.println("계좌를 선택하세요. ");
		int selectedAcc = scanner.nextInt();

		this.accountNo = accounts[selectedAcc - 1].getAccountNo();
		this.name = accounts[selectedAcc - 1].getName();
		this.balance = accounts[selectedAcc - 1].getBalance();
	}

	public void transfer() {
		if (scanner == null)
			start();

		// Account workingAccount = accounts[this.accountNo - 1];
		System.out.println("누구에게 송금하시겠어요? ");
		for (Account acc : this.accounts) {
			System.out.printf(" %d:%s, ", acc.getAccountNo(), acc.getName());
		}

		int selectedAccNo = scanner.nextInt();
		Account toAccount = accounts[selectedAccNo - 1];
		System.out.print("얼마를 송금하시겠어요?");
		double transAmount = this.transferTo(toAccount, scanner.nextDouble());

		System.out.printf("transAmount = %,.1f\n", transAmount);

		if (scanner != null)
			end();
	}

	public void start() {
		if (this.scanner == null) {
			this.scanner = new Scanner(System.in);
		}
		System.out.println("시작");
	}

	public void action() {
		if (this.scanner == null) {
			System.out.println("start를 먼저 해주세요");
			return;
		}
		while (true) {
			System.out.print("메뉴를 누르세요(+ 입금, - 출금, q 종료) :");
			String cmd = scanner.nextLine();
			this.display();

			switch (cmd) {
				case "+" -> {
					this.deposit();
				}

				case "-" -> {
					this.withdraw();
				}

				case "q" -> {
					return;
				}
				default -> {
					System.out.println("Error");
				}
			}

		}
	}

	public void end() {
		if (this.scanner != null) {
			this.scanner.close();
		}
		System.out.println("종료");
	}

	private void deposit() {
		System.out.print("입금하실 금액을 입력하세요: ");
		double d = Double.parseDouble(scanner.nextLine());

		this.balance += d;
		checkBalance();
	}

	private void withdraw() {
		System.out.print("출금하실 금액을 입력하세요: ");
		double d = Double.parseDouble(scanner.nextLine());

		if (this.balance - d < 0) {
			System.out.println("잔액이 부족하여 출금할 수 없음!");
			checkBalance();
			return;
		}
		this.balance -= d;
		checkBalance();
	}

	private void checkBalance() {
		System.out.println(this.name + "님의 잔액은 " + this.balance + "원 입니다.");
	}

	private void display() {
		// System.out.println("---------------------------");
		// System.out.println("-".repeat(30));
		// System.out.println("계좌번호 : " + this.accountNo);
		// System.out.println("예금주 : " + this.name);
		// System.out.println("잔액 : " + this.balance);
		// System.out.println("---------------------------");

		System.out.printf("""
			%s
			계좌번호 : %d
			예금주 : %s
			잔액 : %.1f
			%s%n""", "-".repeat(30), this.accountNo, this.name, this.balance, "-".repeat(30));

	}

	@Override
	public String toString() {
		return "Account{" +
			"accountNo=" + getAccountNo() +
			", name='" + getName() + '\'' +
			", balance=" + getBalance() +
			'}';
	}

	public static void main(String[] args) {
		// Account[] accounts = new Account[3];
		// accounts[0] = new Account(1, "코난", 100000);
		// accounts[1] = new Account(2, "장미", 100000);
		// accounts[2] = new Account(3, "미란", 100000);
		//
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("계좌를 선택하세요:");
		// for (Account acc : accounts) {
		// 	System.out.printf(" %d:%s, ", acc.getAccountNo(), acc.getName());
		// }
		// int selectedAccNo = scanner.nextInt();
		// Account workingAccount = accounts[selectedAccNo - 1];
		// System.out.println("누구에게 송금하시겠어요? ");
		// for (Account acc : accounts) {
		// 	System.out.printf(" %d:%s, ", acc.getAccountNo(), acc.getName());
		// }
		// selectedAccNo = scanner.nextInt();
		// Account toAccount = accounts[selectedAccNo - 1];
		//
		// System.out.print("얼마를 송금하시겠어요?");
		// double transAmount = workingAccount.transferTo(toAccount, scanner.nextDouble());
		//
		// System.out.printf("transAmount = %,.1f\n", transAmount);
		//
		// scanner.close();

		Account account = new Account();
		account.initialize(); // 0 1 2
		account.selectAccount();
		account.transfer();

		// account.start();
		// account.action();
		// account.end();

		// example();

	}

	public void example() {
		// this.display();
		// this.withdraw(20000);
		// this.deposit(30000);
		// this.withdraw(1500);

	}

}
