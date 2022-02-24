package computer_programming2;

import java.util.Map;
import java.util.stream.Collectors;

public class Counting_Duplicate_Characters {

	public static void main(String[] args) {
		
		System.out.println("Duplicate Characters:");
		
		// given input string
		String input = "alessandra micaela";
				
		// convert string into stream
		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		result.forEach((k, v) -> {
		if (v > 1) {
			System.out.println(k + ":" + v);
					}
		});
	}

}
