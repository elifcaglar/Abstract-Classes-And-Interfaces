package deneme;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {

	public static void main(String[] args) {
		
		/*****program that finds the largest 
number in a list of Number objects.*****/
		
		
		//create an array list of Number objects
		ArrayList<Number> list = new ArrayList<>();
		
		//adds  Integer ,Double, BigInteger, BigDecimal objects to list
		//3 is converted automatically Integer and 67.5353 is Double also
		list.add(3);
		list.add(67.5353);
		list.add(new BigInteger("3432323234344343101"));
		list.add(new BigDecimal("2.0909090989091343433344343"));
		
		System.out.println("the largest number is " +getLargestNumber(list));
		
		
	}
	
	public static Number getLargestNumber(ArrayList<Number> list) {
		//returns null if the list is empty
		if(list == null && list.size() == 0)
		return null;
		
		Number number = list.get(0);
		for(int i = 0 ; i < list.size(); i++)
			//numbers are compared by their doubleValue() method
 		     if(list.get(i).doubleValue() > number.doubleValue()) {
		    	 number = list.get(i);
		    	 
		     }
		return number;
	}
	

}
