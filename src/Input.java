import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù���� �Է°�: ");
		int firstInput = scanner.nextInt();
		System.out.println(firstInput);
		return firstInput;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("�����ȣ: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("�ι�° �Է°�: ");
		int secondInput = scanner.nextInt();
		System.out.println(secondInput);
		return secondInput;
	}
	
	


}
