package computer_programming2;

public class String_Contains_Only_Digits {

	public static void main(String[] args) {
		String str = "121702";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String:"+str);
		System.out.println("Does string contain only digits?:"+result);

	}

}
