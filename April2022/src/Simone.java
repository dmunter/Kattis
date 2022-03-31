import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Simone {
//https://open.kattis.com/problems/colourwars
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length =sc.nextInt(), colors = sc.nextInt();
		
		int ar[] = new int [length];
		//create a map of size colors. Start with a value of 0 in each
		HashMap<Integer, Integer> appearances = new HashMap<>();
		for (int i = 1; i <= colors; i++) {
			appearances.put(i, 0);
		}
		
		for (int i = 0; i < length; i++) {	
			int curr = sc.nextInt();			
			appearances.put(curr, appearances.get(curr)+1);		
			//System.out.println(appearances.get(curr));
		}
		//appearnces holds all of the occurances and colors
		//now we need to find the key in appearances that has the smallest value.
		int max = Integer.MAX_VALUE;
		for(int key : appearances.keySet()) {
			if(appearances.get(key) <= max ) {
				max = appearances.get(key); 
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		int count = 0;
		//do the same thing as above but this time grab all the apearances that have the max as their value
		for(int key : appearances.keySet()) {
			if(appearances.get(key) == max ) {
				//add the key to an array list so we call for each element and print it
				ans.add(key);
				count +=1;
			}
			
		}
		System.out.println(count);
		ans.stream()
			.forEach((k)-> System.out.print(k + " "));
		
		
	}
		
}
