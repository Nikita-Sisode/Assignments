/*Write a Java program to sort a given array list.*/


import java.util.*;
public class SortArrayList {
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
		Collections.sort(name);
		
		System.out.println("SortedList:"+name);
    }
}