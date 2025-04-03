package BasicJava;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		
		HashSet H1 = new HashSet();
       H1.add("Charlie");
       H1.add("Brian");
       H1.add(3.55);
       H1.add("Aviana");
       H1.add("Charlie"); // Duplicate, will not be added
        
        boolean b1= H1.contains("Bob");
        
        System.out.println(H1); // Output: 

        System.out.println(b1); // Output: false
        System.out.println(H1.size());//index 3
      
        Iterator a2= H1.iterator();//iterator
    	System.out.println("-------use iterator------- ");
    	while(a2.hasNext())
    	{
    		System.out.println(a2.next());
    	}
    	
    	//ListIterator <String> L1= H1.listiterator();
    	
    	System.out.println("-------Dynamic------- ");
    	H1.add("Darwin");
    	H1.add("Alwin");
    	H1.add(null);
    	System.out.println(H1); //Output
	    
    	HashSet<String> N1 = new HashSet<>();
    	N1.add("Neelima");
    	N1.addAll(H1);
    	System.out.println(N1); //Output:
    	System.out.println(N1.size());
    	
    
   N1.clear();
   System.out.println(N1.size());
	}
	

}
