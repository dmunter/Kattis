
import java.util.ArrayList;
import java.util.Scanner;
//https://open.kattis.com/problems/espresso

public class Espresso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt(), maxOunces = sc.nextInt();
		sc.nextLine();
		ArrayList <Integer> ar = new ArrayList<>();
		int sumOunces = 0;
		int refill =0;
		for (int i = 0; i < lines; i++) {
			String curr = sc.nextLine();
			int currentOunces=0;
			if(curr.charAt(curr.length()-1) == 'L') {
				//if the drink is a late ad one to the ounces
				currentOunces = (Integer.parseInt(curr.substring(0,curr.length()-1)))+1;
								 
				//sumOunces += currentOunces;
			} else {
				currentOunces = (Integer.parseInt(curr.substring(0,curr.length())));
				//sumOunces += currentOunces;
			}
			
			if(currentOunces + sumOunces <= maxOunces) {
				sumOunces+=currentOunces;
			} else {
				//increase the refill count
				refill++;
				//reset the the current accumulative ounces
				sumOunces = currentOunces; 
			}								
		}
		System.out.println(refill);				
	}

}
