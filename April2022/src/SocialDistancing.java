import java.util.Scanner;

//https://open.kattis.com/problems/socialdistancing2
public class SocialDistancing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Seats = sc.nextInt(), NumPeopleCurr = sc.nextInt();
		int ar[] = new int[NumPeopleCurr];		
		for (int i = 0; i < NumPeopleCurr; i++) {
			int index = sc.nextInt();
			ar[i] = index;					
		}

		int total=0;
		int curgap =0;
		
		for(int x = 0; x< NumPeopleCurr; x++) {
			if(x==0) {
			int lastEmpty = Seats - ar[NumPeopleCurr-1]; 
		
			 curgap = ar[x] + lastEmpty-1;
			} else {
				//finds the amount of open chairs between every 2 people
				curgap = ar[x] - (ar[x-1]+1);
			}
			//uses math to calculate how many people are allowed in the chairs between every 2 people
			if(curgap%2==0) {
				total = total + ((curgap/2)-1);
			}else {
				total = total + ((curgap-1)/2);
			}	
		}	
		System.out.println(total);	
	}
}
