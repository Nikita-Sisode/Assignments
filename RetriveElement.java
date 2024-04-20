/*Write a Java program to retrieve an element (at a specified index) from a given array list.*/

import java.util.ArrayList;
public class RetriveElement {
    public static void main(String [] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Navneet");
        name.add("Mrunmayi");
        name.add("Nidhi");
        name.add("Mrudula");
		name.add("Nikhil");
		name.add("Mitesh");
		name.add("Nishant");
        System.out.println(name);
	
	 System.out.println("The Retrive Element at index 4:"+name.get(4));
		
    }
}