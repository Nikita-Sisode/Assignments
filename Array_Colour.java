/*1.	Write a Java program to create a new array list, add some colors (string) and print out the collection.*/



import java.util.ArrayList;
public class Array_Colour {
    public static void main(String [] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Red");
		color.add("White");
		color.add("Pink");
		color.add("Blue");
        System.out.print(color);
    }
}