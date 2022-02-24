package computer_programming2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Finding_the_First_non_Repeated_Character {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any string text");		
		
		String str = scanner.nextLine().toLowerCase();		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		boolean status = false;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i); 
			
			if(map.get(ch)==null) {
			
				map.put(ch,1);
				
		}else {
			
			map.put(ch,map.get(ch)+1);
			
			}
		

		}
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(map.get(ch)==1) {
				
				System.out.println("The first non-repeated character in the string text is:"+ch);
				status = true;
				break;
				
				
			}
			
		}
		
		
		if(!status) {
			
			System.out.println("There is no unique character in this string text");
		}
   }
}
