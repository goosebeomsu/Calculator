import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫번재 입력값: ");
		int firstInput = scanner.nextInt();
		System.out.println(firstInput);
		return firstInput;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("연산기호: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력값: ");
		int secondInput = scanner.nextInt();
		System.out.println(secondInput);
		return secondInput;
	}
	
	


}
