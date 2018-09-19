package main.java.com.omar.core;
import java.util.HashMap;
import java.util.*;
public class App {
	public static void main(String[] args) {

		System.out.println(getHelloWorld());

	}

	public static String getHelloWorld() {	
		
		Map<String, Integer> m = new HashMap<String, Integer>();	
	
		//for(int i = 0; i < 10; i++) {
        	    m.put(String.valueOf(0), 0);
       	 //}	
		Set<String> keys = m.keySet();	
        	Iterator iter = keys.iterator();
        	int size = m.size();
        	for(int i = 0 ; i < size - 1; i++){
        	    //System.out.println(iter.next());
        	    iter.next();
       	 } 
      	  int ele = m.size() + 1;
      	  m.put(String.valueOf(ele), ele);
      	  //System.out.println(iter.next());
      	  iter.next();
		
		/*
		List<String> myList =
		Arrays.asList("Main-a1", "Main-a2", "Main-b1", "Main-c2", "Main-c1");

		myList
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);
		return "Hello World";

	}

	public static String getHelloWorld2() {

		return "Hello World 2";

	}
	public static String getHelloWorld3() {

		return "Hello World 3";

	}
	public static String getHelloWorld4() {

		return "Hello World 4";

	}
	public static String getHelloWorld5() {

		return "Hello World 5";

	}
}
