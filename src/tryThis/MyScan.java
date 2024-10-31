package tryThis;

import java.util.Scanner;

public class MyScan {
	public static void main(String[] args) {
		// scanUserInfo();
		scanTemp();
	}

	private static void scanTemp() {
		final int currTemp = 20;
		Scanner scanner = new Scanner(System.in);

		System.out.print("수심: ");
		int deep = scanner.nextInt();
		System.out.println("deep = " + deep);
		double result = currTemp - (Math.floor((double)deep / 10)) * 0.7;
		System.out.println();
		scanner.close();
	}

	private static void scanUserInfo() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Addr: ");
		String addr = scanner.nextLine();
		System.out.print("Age: ");
		int age = scanner.nextInt();
		System.out.print("Height: ");
		double height = scanner.nextDouble();

		System.out.printf("name is %s, addr is %s, age is %d, height is %4.1f%n", name, addr, age, height);

		scanner.close();
	}
}
