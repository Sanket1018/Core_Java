package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {

	public static void main(String[] args) {
		// Apporoch1
		Stream<Integer> stream1 = Stream.of(1,2,3,4);
		
		//Apporoch2 
		ArrayList<String> names = new ArrayList<>();	
		names.add("Sanket");
		names.add("Rohan");
		names.add("Akash");
		
		Stream<String> stream2 = names.stream();
		
		User u1 = new User("Sanket",23);
		User u2  = new User("Rohan",21);
		User u3 = new User("Akash",24);
		
	
		Stream<User> stream = Stream.of(u1,u2,u3);
		stream.filter(u-> u.age > 21).forEach(i-> System.out.println(i));
		
		System.out.println("----------------------------");
		
		Stream<User> stream_1 = Stream.of(u1,u2,u3);
		// filter the users who is greater than 18 and whose name start with s 
		stream_1.filter(u -> u.age>= 18 && u.name.startsWith("S"))
			.forEach(u -> System.out.println(u));
		
		System.out.println("----------------------------");
		
		Stream<User> stream_2 = Stream.of(u1,u2,u3);
		stream_2.filter(u -> u.age>= 18)
			.filter(u-> u.name.startsWith("S"))
			.forEach(u -> System.out.println(u));
		
//		one stream can be utilized only once 
		

	}

}
