package BasicJava;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet names = new TreeSet();
        names.add("Charlie");
        names.add("Brian");
        //names.add(3.55);
    	//names.add(null);
        names.add("Aviana");
        names.add("Charlie"); // Duplicate, will not be added
        
        boolean b1= names.contains("Bob");
        
        System.out.println(names); // Output: [Aviana, Brian, Charlie]

        System.out.println(names.first()); // Output: Alice
        System.out.println(names.last()); // Output: Charlie
        System.out.println(b1); // Output: false
        System.out.println(names.size());//index 3
      
        Iterator a2= names.iterator();//iterator
    	System.out.println("-------use iterator------- ");
    	while(a2.hasNext())
    	{
    		System.out.println(a2.next());
    	}
    	
    	
    	//ListIterator <String> L1= names.listiterator();
    	
    	System.out.println("-------Dynamic------- ");
    	names.add("Darwin");
    	names.add("Alwin");
    	//names.add(null);
    	System.out.println(names); //Output: [Alwin, Aviana, Brian, Charlie, Darwin]
	    
    	TreeSet<String> N1 = new TreeSet<>();
    	N1.add("Neelima");
    	N1.addAll(names);
    	System.out.println(N1); //Output:[Alwin, Aviana, Brian, Charlie, Darwin, Neelima]
    	System.out.println(N1.size());
    	
    
   N1.clear();
   System.out.println(N1.size());
	}
	

}
