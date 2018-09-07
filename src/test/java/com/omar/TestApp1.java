package test.java.com.omar;

import main.java.com.omar.core.App;
import junit.framework.TestCase;
import org.junit.Test;
import java.util.Iterator;
import java.util.Vector;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;

public class TestApp1 extends TestCase {
//public class TestApp1{


		
		
/*		

	public void testArrayDeque_UnsafeIterator(){
	 	  Math.max(1,2);	
		  ArrayDeque<Integer> q = new ArrayDeque<Integer>();
                  q.add(1);
                  q.add(2);
   
                  Iterator i = q.iterator();
  
                  i.hasNext();
  
                 // q.add(3);
  
                  // The iterator is not valid anymore because the deque has been modified above.
                  i.next();	
			
		  assertEquals(App.getHelloWorld(), "Hello WorldFAIL");
	}
	
	
	public void testPrintHelloWorld0() {
		 ConcurrentSkipListMap<String,String> __map = new ConcurrentSkipListMap<String,String>();
		   __map.put("1", "2");
		assertEquals(App.getHelloWorld(), "Hello World");
	}
	
	
	public void testPrintHelloWorld1() {
		
		Vector<Integer> v = new Vector<Integer>();
         	v.add(1);
          		
	  	v.add(2);
          	v.add(4);
          	v.add(8);
  		
	        
		Iterator i = v.iterator();
        	int sum = 0;
  
 	         while(i.hasNext()){
        	      sum += (Integer)i.next();
			 sum += (Integer)i.next();
		      	
		 }
		System.out.println("The assertion is true");
		
		assertEquals(App.getHelloWorld(), "Hello World");
	}
	

	public void testPrintHelloWorld2() {
		Vector<Integer> v = new Vector<Integer>();
         	v.add(1);
          	v.add(2);
          	v.add(4);
          	v.add(8);
  
	        Iterator i = v.iterator();
        	int sum = 0;
  
 	         while(i.hasNext()){
        	      sum += (Integer)i.next();
          	}
		//System.out.println("The assertion is true");
		assertEquals(App.getHelloWorld(), "No World!!");  //Hello World is correct assertion
	}
	
	public void testPrintHelloWorld3() {
		Vector<Integer> v = new Vector<Integer>();
         	v.add(1);
          	v.add(2);
          	v.add(4);
          	v.add(8);
  
	        Iterator i = v.iterator();
        	int sum = 0;
  
 	         while(i.hasNext()){
        	      sum += (Integer)i.next();
          	}
		System.out.println("The assertion is true");
		assertEquals(App.getHelloWorld(), "Hello World2");
		
	}
	
	
	
	

	
	@Test
   	public void testGetClassByAnnotation() {
        int x = 1/0;
        System.out.println(x);
    	}
		
		
	@Test
   	public void testIllegalStateException() throws Exception {
        	if(true) throw new IllegalStateException("Already connected");
    	}	
		
		
	@Test
	public void testUnsafeIterator() {
	
		Set<Integer> testSet = new HashSet<Integer>(); 
        	for(int i = 0; i < 10; ++i){
           	 	testSet.add(new Integer(i));
        	}
        	Iterator i = testSet.iterator();
        
       		int output = 0; 
        	for(int j = 0; j < 10 && i.hasNext(); ++j){
            		output += (Integer)i.next();
            		testSet.add(new Integer(j));
       		}
		
		TestCase.assertEquals(App.getHelloWorld(), "Hello World");
		

	}
	
	@Test
	public void testPrintHelloWorld2() {
		Vector<Integer> v = new Vector<Integer>();
         	v.add(1);
          	v.add(2);
          	v.add(4);
          	v.add(8);
  
	        Iterator i = v.iterator();
        	int sum = 0;
  
 	         while(i.hasNext()){
        	      sum += (Integer)i.next();
          	}
		//System.out.println("The assertion is true");
		TestCase.assertEquals(App.getHelloWorld(), "Hello World2");
	}	
	@Test
	public void testFileLenght(){
	
		  File f = new File(".");
  
                  long filesize = 0;
                  if (f.isFile())
                          filesize = f.length();
                  else {
                          // The return value of the following is unspecified because a File
                         // object represents a directory.
                          filesize = f.length();
                  }
		
	TestCase.assertEquals(App.getHelloWorld(), "Hello World");
	}

	@Test
	public void testConsoleWriter(){
	try{
	 	Console cons = System.console();
         	Writer writer = cons.writer();
	 	writer.close();
	}catch(Exception ex){}
	TestCase.assertEquals(App.getHelloWorld(), "Hello World");	
	}
	
	@Test
	public void testUnsafeIterator(){
	
	Set<Integer> s = new HashSet<Integer>();	
	
	for(int i = 0; i < 10; i++) {
            s.add(new Integer(i));
        }	
		
	Iterator iter = s.iterator();
        int size = s.size();
        for(int i = 0 ; i < size - 1; i++){
            iter.next();
        } 
        int ele = s.size() + 1;
        s.add(new Integer(ele));
        iter.next();
	
		
		
	TestCase.assertEquals(App.getHelloWorld(), "Hello World");
	}	
		
	@Test
	public void testUnsafeMapIterator(){
	
		
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
		
		
	//TestCase.assertEquals(App.getHelloWorld(), "Hello World");
	}		
*/
	
	@Test
	public void testLambda(){
		List<String> myList =
    		Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);
	
	
	}
	
	
}

