package oop;

import java.util.Scanner;

public class Account {
	private final int accountNo;
	private final String name;
	private double balance;

	private Scanner scanner;

	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
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

	public static void main(String[] args) {
		Account account = new Account(11111, "코난", 10000);

		account.start();
		account.action();
		account.end();

		// example();

	}

	public void example() {
		// this.display();
		// this.withdraw(20000);
		// this.deposit(30000);
		// this.withdraw(1500);

	}

}
