import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

///https://open.kattis.com/problems/tourdefrance

public class TourdeFrance {
	static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int f = s.nextInt();		
		while(f!= 0) {
			f = input(f);				
		}
		
	}
	
		public static int input(int f) {
			//Scanner s = new Scanner(System.in);
			 int r = s.nextInt();
			 int listSize = f*r;
			 ArrayList<Double> ratio = new ArrayList<Double>();
			 int af[] = new int[f];
			 int ar[] =new int[r];
			 for (int i = 0; i < f; i++) {af[i] = s.nextInt();	}
			 for (int y = 0; y < r; y++) {ar[y] = s.nextInt(); }
			 //System.out.println(ratio.get(1));
			 for (int i = 0; i < f; i++) {
				 double curF = af[i]; 
				 for (int y = 0; y < r; y++) {
					 double curR = ar[y];
					 ratio.add(curR/curF);
				 }
			 
			 }	
			 Collections.sort(ratio);
			 double max = 0;
			 for(int x = 0; x< listSize-1; x++){
				 double cur = ratio.get(x+1)/ratio.get(x);
				 if(cur> max) {
					 max = cur;
				 }
			 }
			
			System.out.println(Math.round(max*100.0)/100.0);
			
			int next = s.nextInt();
			
			return next;
		}
}
