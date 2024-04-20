/*Write a Java program to insert an element into the array list at the first position.*/


import java.util.ArrayList;
public class InsertFirstPosition {
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
		
		name.add(0,"Nikita");
    System.out.println(name);
		
    }
}