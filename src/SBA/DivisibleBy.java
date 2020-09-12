package SBA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibleBy {
	public static void main(String[] args) throws IOException {

		boolean divisibleBy10 = false;
		// declare String array of size specified in casestudy

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numbers to find those divisible by 10");
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		int i = 0;
		for (String string : arr) {
			if (Integer.parseInt(string) % 10 == 0) {
				System.out.println(string);
				divisibleBy10 = true;
			}
		}

		// Write your code to get the inputs to be added to string array. From array,
		// display those that are divisible by 10

		// if there is no numbers added to the string array is divisible by 10, display
		if (!divisibleBy10)
			System.out.println("None divisible by 10");

	}

}
