package BasicJava;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet a1= new LinkedHashSet();
		a1.add("hello");
		a1.add('c');
		a1.add(3.4f);
		a1.add(true);
		a1.add(null);
		a1.add(3.55);
		a1.add("Hiii");
		a1.add("Hiii");
		System.out.println(a1);
		  System.out.println(a1.size());//index 
		
		Iterator a2= a1.iterator();//iterator
    	System.out.println("-------use iterator------- ");
    	while(a2.hasNext())
    	{
    		System.out.println(a2.next());
    	}
    	
    	//ListIterator <String> L1= a1.listiterator();
    	System.out.println("-------Dynamic------- ");
    	a1.add("Darwin");
    	a1.add("Alwin");
    	a1.add(null);
    	System.out.println(a1); //Output
    	
    	LinkedHashSet<String> N1 = new LinkedHashSet<>();
    	N1.add("Neelima");
    	N1.addAll(a1);
    	System.out.println(N1); //Output:
    	System.out.println(N1.size());
    	
    	
   N1.clear();
   System.out.println(N1.size());

	}

}
