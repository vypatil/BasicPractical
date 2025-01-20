package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringAndLength {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("a", "bob", "ccc,", "bb", "dd");
		Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(grouped);

		List<String> l1 = Arrays.asList("java", "hibernate", "sql");
		List<String> l2 = Arrays.asList("spring", "docker", "Junit");
		List<String> l3 = Arrays.asList("Springboot", "Maven", "Swagger");

		List<String> mergedList = Arrays.asList(l1, l2, l3).stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(mergedList);
		
	}

}
