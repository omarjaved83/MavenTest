package main.java.com.omar.core;
import java.util.HashMap;
import java.util.*;
public class App {
	public static void main(String[] args) {

		System.out.println(getHelloWorld());

	}

	public static String getHelloWorld() {		
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
                  q.add(1);
                  q.add(2);
   
                  Iterator i = q.iterator();
  
                  i.hasNext();
  
                  // The iterator is not valid anymore because the deque has been modified above.
                  i.next();	
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
