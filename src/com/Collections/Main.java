package com.Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Shipment> q = new PriorityQueue<>();
		boolean flag = true;
		do {
			System.out.println("Enter the shipment detail:");
			String details = sc.nextLine();
			String[] arr = details.split(",");
			int priority = 0;
			if (arr[3].equalsIgnoreCase("yes"))
				priority = 1;
			q.add(new Shipment(arr[0], arr[1], arr[2], priority));
			System.out.println("Do you want to add another shipment?(yes/no) ");
			String add = sc.nextLine();
			if (add.equalsIgnoreCase("no"))
				flag = false;
		} while (flag);
		System.out
				.println(String.format("%-15s%-15s%-15s%s", "Name", "Arrivalport", "Depatureport", "Express delivery"));
		while (!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
