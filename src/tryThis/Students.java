package tryThis;

import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int n = scanner.nextInt();
		int[] students = new int[n];
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d번 학생의 점수를 입력하세요\n", i);

			students[i] = scanner.nextInt();
		}
		System.out.printf("%d명의 학생 성적은 다음과 같습니다.\n", n);
		for (int i : students) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d번의 학생의 등급은 ", i);
			switch (students[i] / 10) {
				case 10, 9 -> System.out.print('A');
				case 8 -> System.out.print('B');
				case 7 -> System.out.print('C');
				case 6 -> System.out.print('D');
				default -> System.out.print('F');
			}
			System.out.println("입니다.");
		}
		scanner.close();
	}
}
