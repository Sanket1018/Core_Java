package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
	
	public static void main(String[] args) {
		List<String> javaCourses = Arrays.asList("Core java","Adv java","Springboot","Microservices");
		List<String> uiCourses = Arrays.asList("html","css","javascript");
		
		List<List<String>> courses = Arrays.asList(javaCourses,uiCourses);
		
		// flatmap method is used to flaten a List of streams into one stream
		
		Stream<String >fms= courses.stream().flatMap(s -> s.stream());
		fms.forEach(c -> System.out.println(c));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
