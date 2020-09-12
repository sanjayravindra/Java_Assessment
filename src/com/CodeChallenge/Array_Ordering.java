package com.CodeChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ordering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		if (n > 0 && n < 20) {
			int[] arr = new int[n];
			int[] even = new int[n - n / 2];
			int[] odd = new int[n / 2];
			System.out.println("Enter the elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int x = 0;
			int y = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					even[x] = arr[i];
					x++;
				} else {
					odd[y] = arr[i];
					y++;
				}
			}
			Arrays.sort(even);
			Arrays.sort(odd);
			for (int i = 0; i < even.length; i++) {
				System.out.println(even[i]);
				for (int j = i; j < odd.length;) {
					System.out.println(odd[j]);
					break;
				}
			}
		} else
			System.out.println(n + " is not a valid array size");
	}
}
