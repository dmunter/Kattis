import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Simone {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int k = sc.nextInt();
	       
	        HashMap<Integer, Integer> colors = new HashMap<>();
	        for (int i = 1; i <= k ; i++) {
	            colors.put(i, 0);
	        }
	        for (int i = 0; i < n; i++) {
	            int col = sc.nextInt();
	            int curr = colors.get(col);
	            colors.replace(col, curr + 1);
	        }
	       
	        int min = Integer.MAX_VALUE;
	        System.out.println(colors.keySet());
	        for(Integer val: colors.values()) {
	        	System.out.println(val);
	        	if(val < min) { 
	        		min = val;}
	        }
	        System.out.println(" ");
	        ArrayList<Integer> least = new ArrayList<>();
	       
	        for(Integer key: colors.keySet()) if (colors.get(key) == min) least.add(key);	       
	        least.sort((a,b) -> a-b);      
	        System.out.println(least.size());
	       	least.forEach(a -> System.out.print(a + " "));
	      		
		 }
}



