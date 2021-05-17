package main;

public class Tables {

	Utils util = new Utils();
	
	public void dataTypes(int a, int b) {
		util.clear();
		
		String str = a + " + " + b;
		char char_a = (char) a;
		char char_b = (char) b;
		int times = a * b;
		float divide = a / b;
		boolean bool = (a == b);
		
		// 17 14 18 19 35
		System.out.println("+=====================================================================================================================+");
		System.out.println("+  + (String type)  |  (Characters)  |  * (Integer Type)  |  / (Floating Type)  |  Input 1 == Input 2 (Boolean Type)  +");
		System.out.println("+=====================================================================================================================+");
		System.out.printf("+  %-17s|  %c %c %-10s|  %-18d|  %-19.3f|  %-34b +\n", str, char_a, char_b, " ", times, divide, bool);
		System.out.println("+=====================================================================================================================+");
	}
	
	public void arithmetic(int a, int b) {
		util.clear();
		
		int plus = a + b;
		int minus = a - b;
		int times = a * b;
		int divide = a / b;
		int modulus = a % b;

		System.out.println("+=======================================+");
		System.out.println("+ Data Type : Integer                   +");
		System.out.println("+=======================================+");
		System.out.println("+   +   |   -   |   *   |   /   |   %   +");
		System.out.println("+=======================================+");
		System.out.printf("+  %-5d|  %-5d|  %-5d|  %-5d|  %-4d +\n", plus, minus, times, divide, modulus);
		System.out.println("+=======================================+");
	}
	
	public void logical(boolean a, boolean b) {
		util.clear();
		
		System.out.println("+=====================================================+");
		System.out.println("+ Logical Table                                       +");
		System.out.println("+=====================================================+");
		System.out.println("+  P1 = " + ((a) ? "T" : "F") + " , P2 = " + ((b) ? "T" : "F") + "                                    +");
		System.out.println("+=====================================================+");
		System.out.println("+     !P1     |     !P2     |     &&     |     ||     +");
		System.out.println("+=====================================================+");
		System.out.printf("+     %-8b|     %-8b|     %-7b|     %-6b +\n", (!a), (!b), (a && b), (a || b));
		System.out.println("+=====================================================+");
	}
}
