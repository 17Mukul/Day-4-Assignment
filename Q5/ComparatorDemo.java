package com.demo.map; 

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo { 

	public static void main(String[] args) {
	List<String> list = new LinkedList<>();
		
		list.add("Mukul");
		list.add("Ritik");
		list.add("Deepak");
		list.add("Ankit");
		list.add("Lalit");
		list.add("Ram");
		list.add("Shreya");
		
		
		  Collections.sort(list, (a, b) -> a.name.compareToIgnoreCase(b.name));
	        System.out.println(list);

	}

}
