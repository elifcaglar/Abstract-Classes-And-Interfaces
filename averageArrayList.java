package yeniProje;

import java.util.ArrayList;
import java.util.Scanner;

public class averageArrayList {
	/****(Average ArrayList) Write the following method that averages an ArrayList of 
integers:
public static void average(ArrayList<Integer> list)*****/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//ask user to ensure array size
		System.out.print("how many numbers will you add in the list ?");
		int in = input.nextInt();
		
		
		//create array list
		ArrayList<Integer> list = new ArrayList<>(in);
		
		System.out.println("enter numbers");
		
		
		//add numbers
		for(int i = 0; i < in; i++) 
		    	list.add(input.nextInt());
		   
		
			
		//print list
		System.out.println("---LIST---");
		for(Integer arr :list) 
			System.out.println(list);
		
		
		average(list);

	}
	
	
	
	public static void average(ArrayList<Integer> list) {
		int sum = 0 ,avg;
		for(int i = 0; i < list.size(); i++) {
			
			//getting elements from list and adding to the variable sum
			sum += list.get(i);
		}
		
		//finds average of the list
		avg = sum / list.size();
		
		System.out.println("the average of the list: " +avg);
	}

	
	
	
}
