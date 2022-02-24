import java.util.HashMap;
import java.util.Scanner;

public class ColourWars {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		    HashMap<Integer, Integer> colors = new HashMap<>();
		    for(int x = 0; x < n; x++) {
		    	int curr = sc.nextInt();
		    	colors.put(curr, colors.getOrDefault(curr, 0)+1) ;
		    }
		    //the loop above creates a map of size distinct inputs
		    int total = 0;
		    for(int x: colors.keySet()) {	    		    	    	
		    	total += Math.ceil(((double)colors.get(x) / (x+1))) * (x + 1); 	
		    }
		    System.out.println(total);
		}

	}

