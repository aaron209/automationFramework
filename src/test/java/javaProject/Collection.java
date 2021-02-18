package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	}
}
