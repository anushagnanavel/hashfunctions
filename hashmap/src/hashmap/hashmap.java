package hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap implements the Map interface which allows us to store key and value pair.
 * No size limits.
 * Contains only unique keys.
 * May have one null key and multiple null values.
 * Not synchronized.
 * Doesn't maintain the insertion order.
 * Allows null value.
 */

class hashmap{  
    public static void main(String args[])
    {  
    	
        System.out.println("\n\nHashMap add elements --->");
        
        //Adding elements to the HashMap
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"anusha"); 
        hashMap.put(2,"manju");
        hashMap.put(3,"lalitha");
        hashMap.put(1,"vishnu");    //trying duplicate key 
        hashMap.put(4, "deepa");
        System.out.println("\nInitial list of elements: " + hashMap);
        
        //Adding second map elements to the first map 
        HashMap<Integer,String> subMap = new HashMap<Integer,String>();
        subMap.put(1,"vishnu");   
        subMap.put(2,"dilli");  
        hashMap.putAll(subMap);  
        System.out.println("\nputAll(Collection<? extends E> c) method: " + hashMap);
        
        //HashMap putIfAbsent method
        hashMap.putIfAbsent(4, "deepa");
        hashMap.putIfAbsent(5, "Siva");
        System.out.println("\nInitial list of elements: " + hashMap);
        System.out.println("\n\nHashMap remove elements ---> ");
        
        //key-based removal   
        hashMap.remove(1);  
        System.out.println("\nremove(key) method: "+hashMap);  
 
        //value-based removal 
        hashMap.remove("Kamal");  
        System.out.println("\nremove(value) method: "+hashMap);  
        //key-value pair based removal    
        hashMap.remove(4, "Ajith");    
        System.out.println("\nremove(k,v) method: "+hashMap);  
        /*
         * HashMap methods_______________________________________________________________________________________________________________________
         */
        System.out.println("\n\nHashMap methods ---> ");
        //Displaying the size of the HashMap  
        System.out.println("\nThe size of the hashMap is: " + hashMap.size());  
        //Check for the empty map
        System.out.println("\nIs the hashMap empty: " + hashMap.isEmpty());  
        //Replace using key 
        hashMap.replace(2,"Gowtham");
        System.out.println("\nUpdated hashMap after replace: " + hashMap);   
        //ReplaceAll method
        hashMap.replaceAll((k,v) -> "Actor");
        System.out.println("\nUpdated hashMap after replace: " + hashMap);
        
        /*
         * Ways to iterate the HashMap elements__________________________________________________________________________________________________
         */
        System.out.println("\n\nWays to iterate the HashMap elements --->"); 
        //Traversing hashMap through Iterator
        for(Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }  
}  