package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// Set and Map collection
		String name[] = { "myname", "thisname", "anonymous", "myname" };
		List<String> list = new ArrayList<String>(Arrays.asList(name));
		Set<String> set = new HashSet<String>(list);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "name");
		map.put(5, "address");
		map.put(8, "email");
		Set set1 = map.entrySet();
		Iterator it = set1.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(map.get(2));

		// get first N(5) elements from list into list
		List<String> firstNElements = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(firstNElements);

		// sort the collection in ascending and descending order
		Arrays.sort(name);
		Arrays.sort(name, Collections.reverseOrder());
	}
}
