package computer_programming2;

public class White_Spaces {

	public static void main(String[] args) {
		
		String str = "P  lay the Ga me";
		
		
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
		
	}

}
