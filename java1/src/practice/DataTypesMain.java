package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.LinkedHashMap;

public class DataTypesMain {

	public static void main(String[] args) {
	// String, int, float, decimal
	List<String> names = new LinkedList<>();
	names.add("usman");
	names.add("nashitah");
	names.add(0, "saleem");

	for (int i = 0; i < names.size(); i++) {
		System.out.println(names.get(i));
	}
	
	List<Integer> ages = new LinkedList<>();
	ages.add(10);
	
	Map<String, Integer> namesAges = new LinkedHashMap<>();
	namesAges.put("usman", 25);
	namesAges.put("nashitah", 35);
	
	System.out.println(namesAges.get("nashitah")); 
	List<String> meal=new LinkedList<>(); 
	meal.add("pulao"); 
	meal.add("karai");  
	meal.add("kari"); 
	for (int i=0; i<meal.size(); i++) { 
		System.out.println(meal.get(i));
		
	}
	
	Map<String,Integer> mealplate=new LinkedHashMap<>(); 
	mealplate.put("pulao", 2); 
	mealplate.put("cake", 3); 
	mealplate.put("pizza", 1); 
	System.out.println(mealplate.get("pulao")); 
	List<Integer>numbers=new LinkedList<>(); 
	numbers.add(30); 
	numbers.add(40);
	numbers.add(50); 
	List<String>professors=new LinkedList<>();
	professors.add("heindel the great"); 
	professors.add("gabriela great lazy"); 
	professors.add("peter hardworking person");  
	Map<String,Integer>work =new LinkedHashMap<>(); 
	work.put("heindel", 30); 
	work.put("gabriele", 10); 
	work.put("peter", 90); 
	for (int i=0;i<numbers.size();i++) {
		System.out.println(numbers.get(i));
	} 
	System.out.println(work.get("heindel")); 
	
	
			
	
	
	
	
	
	
	}
}
