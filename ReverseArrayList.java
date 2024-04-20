/* Write a Java program to reverse elements in a array list.*/


import java.util.*;
public class ReverseArrayList {
    public static void main(String [] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Navneet");
        name.add("Mrunmayi");
        name.add("Nidhi");
        name.add("Mrudula");
		name.add("Nikhil");
		name.add("Mitesh");
		name.add("Nishant");
        System.out.println("ArrayList:"+name);
		Collections.reverse(name);
		
		System.out.println("ReverseList:"+name);
    }
}