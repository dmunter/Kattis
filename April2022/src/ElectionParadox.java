import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


///https://open.kattis.com/problems/electionparadox

public class ElectionParadox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt()-1;
		ArrayList<Integer> citizens = new ArrayList<>();
		long time = System.currentTimeMillis();
		for(int x= 0; x<= N; x++) {
			citizens.add(sc.nextInt());
		}
		Collections.sort(citizens, Collections.reverseOrder());
		
		int half = N/2;
		int totalVotes=0;
		for(int x =0; x < half; x++) {
			totalVotes += citizens.get(x);
		}
		
		for(int x = half; x<= N ; x++) {
			int cur = citizens.get(x);
			if(cur%2==0) {
				totalVotes += ((cur/2)-1);
			} else { totalVotes += (cur/2);
			}
			
		}
		System.out.println(totalVotes);
	}
}
