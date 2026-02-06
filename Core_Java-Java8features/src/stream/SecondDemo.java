package stream;

import java.util.Arrays;
import java.util.List;

public class SecondDemo {
	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("ram","rohan","sanket","abhishek");
		
		// convert the names capital
		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
		
		// calculate the length of names 
		names.stream().mapToInt(name -> name.length()).forEach(n -> System.out.println(n));

		// requirement print the length and names starting with A
		System.out.println("-----------------------------------------");
		
		List<String> names2 = Arrays.asList("Ashok","Anil","Raja","Rani","Johan","Akash","Charles");
		names2.stream()
			.filter(name -> name.startsWith("A"))
			.map(name -> name + "-"+name.length())
			.forEach(name -> System.out.println(name));
		
	
		
		
		
		
		
		
		
		
		
	}

}
