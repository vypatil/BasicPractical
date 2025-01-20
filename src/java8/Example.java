package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("abc", "john", "xyz", "all", "martin");

		// 1.
		names.forEach(name -> System.out.println("Hello, " + name));

		// 2.
		List<Integer> list1 = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(list1);

		// 3.
		List<String> list2filteredNames = names.stream().filter(name -> name.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(list2filteredNames);

		// 4
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
		Set<Integer> uniqueNumber = numbers.stream().collect(Collectors.toSet());
		System.out.println(uniqueNumber);

		// finding String with length count.
		List<String> list = Arrays.asList("abc", "john", "xyz", "all", "martin");
		Map<String, Integer> nameLength = list.stream().collect(Collectors.toMap(name -> name, String::length));
		System.out.println(nameLength);

	}
}
