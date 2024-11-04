package tryThis;

import java.util.Scanner;

import tryThis.comp.Employee;
import tryThis.shape.Circle;
import tryThis.shape.Rectangle;

public class Trythis {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2 = new Circle(2);

		System.out.println(circle);
		System.out.println(circle2);

		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(3, 4);

		System.out.println(rectangle);
		System.out.println(rectangle2);

		Employee[] employees = new Employee[3];

		Scanner scanner = new Scanner(System.in);
		// for (int i = 0; i < employees.length; i++) {
		// 	String inputs = scanner.nextLine();
		// 	String[] input = inputs.split(" ");
		// 	employees[i] = new Employee(Integer.parseInt(input[0]), input[1], Integer.parseInt(input[2]));
		// }
		//
		// for (Employee e : employees) {
		// 	System.out.println(e);
		// }

		InvoiceItem[] invoiceItems = new InvoiceItem[3];

		for (int i = 0; i < invoiceItems.length; i++) {
			String inputs = scanner.nextLine();
			String[] input = inputs.split(" ");
			invoiceItems[i] = new InvoiceItem(input[0], input[1], Integer.parseInt(input[2]),
				Double.parseDouble(input[3]));
		}
		for (InvoiceItem i : invoiceItems) {
			System.out.println(i);
		}
		scanner.close();
	}
}
