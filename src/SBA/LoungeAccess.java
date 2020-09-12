package SBA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LoungeAccess {
	
	public enum Cards
	{
		amex,diners,visa,masters;
	}
	public static void main(String[] args) throws IOException {
		// load the hash map

		// Getting the input as card type from the user..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to TIA! Please enter the Card that you hold:");
		// card = //complete this statement to read the user input
		//
		String card = br.readLine();
		HashMap<Cards, Integer> map = new HashMap<Cards, Integer>();
		map.put(Cards.amex, 4);
		map.put(Cards.diners, 0);
		map.put(Cards.visa, 2);
		map.put(Cards.masters, 1);
		Cards c = null;
		if(card.equalsIgnoreCase("amex"))
		c= Cards.amex;
		else if(card.equalsIgnoreCase("visa"))
			c=Cards.visa;
		else if(card.equalsIgnoreCase("masters"))
			c=Cards.masters;
		switch (c) {
		case amex:
			System.out.println("Lounge access granted for " + map.get(Cards.amex) + " hours. Thank you!");
			break;
		case diners:
			System.out.println("Lounge access denied. Thank you!");
			break;
			
		case visa:
			System.out.println("Lounge access granted for " + map.get(Cards.visa) + " hours. Thank you!");
			break;
		case masters:
			System.out.println("Lounge access granted for " + map.get(Cards.masters) + " hours. Thank you!");
			break;
		default:
			break;
		}
		
		// case structure code goes here
	}
}
