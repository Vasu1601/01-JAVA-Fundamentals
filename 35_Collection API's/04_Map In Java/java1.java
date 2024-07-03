import java.util.Map;
import java.util.HashMap;

class java1{
    public static void main(String[] args){

        Map<String, Integer> students = new HashMap<>();

        students.put("Vasu",95);
        students.put("Jay",89);
        students.put("Mike",65);
        students.put("Alex",57);
        students.put("Jay",91);

        System.out.println(students);
        System.out.println(students.get("Jay"));
        System.out.println(students.keySet());

        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

    }
}

/*
================================================Notes=================================================================================
#1
- Map is not an implementation or it does not extend the collection interface. But it is a part of the collection concept.
 - Map is a collection of key-value pairs. in this, for every value of an element, a key is associated with it.
- Map itself is in an interface that supports key-value pairs. A class that implements it is called HashMap.

#2
- We can add elements in a map using the put() method that accepts both the key and value of it.
- We can get the value of an element by specifying its key of it in the get() method.
- Keys are unique but values can be repeated. The value of a key can also be updated.
- In a map, keys are in a set while values are in a list.
- We can get all the keys by using the method keySet().
- We can get the value of a key by using the method get() and pass a parameter as a key in the method.
- remove() method is used to delete a particular element or an entity from a map.

#3
- We can also use a HashTable instead of using a HashMap.
- The difference between HashMap and HashTable is that HashTable is synchronized while HashMap is normal.
- If you are working with multiple threads at a time, then it is better to use a HashTable to make it synchronized.
======================================================================================================================================          
*/