import java.util.Scanner;

public class Calculator {
	
	static int calculate(int firstInput, String symbol, int secondInput ) {
		int result = 0;
		
		if(symbol.equals("+")) {
			result = firstInput + secondInput;
			System.out.println("µ¡¼À : "+ result);
		} else if(symbol.equals("-")) {
			result = firstInput - secondInput;
			System.out.println("»¬¼À : "+ result);
		} else if(symbol.equals("*")) {
			result = firstInput * secondInput;
			System.out.println("°ö¼À : "+ result);
		} else if(symbol.equals("/")) {
			result = firstInput / secondInput;
			System.out.println("³ª´°¼À : "+ result);
		} else {System.out.println("»çÄ¢¿¬»ê¿¡ ÇØ´çÇÏÁö ¾Ê´Â °ªÀ» ÀÔ·ÂÇß½À´Ï´Ù.");}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInput = Input.getFirstValue(scanner);
		
		int result = firstInput;
		
		while(true) {
			String symbol = Input.getSymbol(scanner);
			
			if("quit".equals(symbol)) {
				Output.printFianl(result);
				break;
			}
			
			int secondInput = Input.getSecondValue(scanner);
			
			result = Calculator.calculate(result, symbol, secondInput);

	  }
		

	}

}