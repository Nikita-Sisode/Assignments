/*Write a Java program of swap two elements in an array list.*/

import java.util.*;
public class SwapArrayList {
    public static void main(String [] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
        System.out.println("ArrayList:" + number);
		Collections.swap(number, 3,5);
		
		System.out.println("SwapArrayList:"+number);
    }
}
