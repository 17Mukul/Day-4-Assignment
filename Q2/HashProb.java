package com.demo.map; 

import java.util.HashMap;

public class HashProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	
			
			HashMap<Integer, String> city = new HashMap<Integer, String>();
			
			city.put(101,"Mysore");
			city.put(102, "Hydrabad");
			city.put(103, "Kolkata");
			city.put(104, "Varansi");
			city.put(105, "Pune");
			city.put(106, "Banglore");
			city.put(107, "Punjab");
			city.put(108, "Mysure");
			city.put(109, "Dharward");
			city.put(110, "Pune");
			
			System.out.println(city);
			
			System.out.println("***Get City***");
			System.out.println(city.get(104));
			
			System.out.println("***Get City By City name***");
			System.out.println(city.containsValue("Banglore"));
			
			city.remove(101);
		

	}

}
