package com.Threads;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of orders:");
		int n = sc.nextInt();
		System.out.println("Enter all the orders (Order ID, Order Amount):");
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(n);
		for (int i = 0; i < n; i++) {
			queue.put(sc.next());
		}
		OrderProcessingThread o = new OrderProcessingThread(queue);
		o.start();
	}
}
