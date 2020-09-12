package com.Threads;

import java.util.concurrent.ArrayBlockingQueue;

public class OrderProcessingThread extends Thread {
	public ArrayBlockingQueue<String> queue;
	public Double totalAmount;

	public ArrayBlockingQueue<String> getQueue() {
		return queue;
	}

	public void setQueue(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public OrderProcessingThread(ArrayBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	public void run() {
		int i = 0;
		double odd = 0;
		double even = 0;
		for (String string : queue) {
			String[] s = string.split(",");
			int id = Integer.parseInt(s[0]);
			double amount = Double.parseDouble(s[1]);
			if (i % 2 == 0) {
				System.out.println("Order " + id + " Processed by Even Thread thread");
				even = even + amount;
			} else {
				System.out.println("Order " + id + " Processed by Odd Thread thread");
				odd = odd + amount;
			}
			i++;
		}
		System.out.println("Total amount processed by even thread:" + even);
		System.out.println();
		System.out.println("Total amount processed by odd thread:" + odd);
	}
}
