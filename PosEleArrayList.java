/*Write a Java program to print all the elements of a ArrayList using the position of the elements.*/


import java.util.*;
public class PosEleArrayList {
    public static void main(String [] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
		number.add(50);
		number.add(60);
		number.add(70);
        System.out.println("ArrayList:" + number);
	   System.out.println("Position of Index Element:");
	   
	   int length = number.size();
	   for (int i = 0; i<length;i++){
	   System.out.println(number.get(i));
	   }
	
    }
}
