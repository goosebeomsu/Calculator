import java.util.Scanner;

public class StringCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요 ex) 1 + 2 * 3");
		String value = scanner.nextLine();
		System.out.println(value);
		
		String[] valueArr = value.split(" ");
		
		int first = Integer.parseInt(valueArr[0]);
		System.out.println("first : "+first);
		
		
		int result = first;
		
		for(int i = 1; i < valueArr.length; i += 2) {
			String symbol = valueArr[i];
			System.out.println("symbol : "+symbol);
			
			int second = Integer.parseInt(valueArr[i+1]);
			System.out.println("second : "+second);
			
			result = Calculator.calculate(result, symbol, second);
			
		}
		
		Output.printFianl(result);

	}

}
