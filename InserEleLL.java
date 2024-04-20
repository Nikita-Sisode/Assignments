/*Write a Java program to insert the specified element at the specified position in the linked list.*/

import java.util.*;
public class InserEleLL{
public static void main (String Args[]){

LinkedList <String> city = new LinkedList<String>();

city.add("Pune");
city.add("Mumbai");
city.add("Nashik");
city.add("Aurangabad");
city.add("Nagpur");
System.out.println("LinkedList:"+city);

city.add(4 ,"Kolhapur");
System.out.println("Insert City Name:" + city);

}

}