package com.demo;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) 
	{
		int pizza = 100;
		int puff = 20;
		int cooldrink=10;
		int pizz=0;
		int totalPizza=0;
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter the no of pizzas bought");
		 pizz = sc.nextInt();
		 totalPizza = pizz*pizza;
		}
		catch(InputMismatchException e)
		{
			
		}
	System.out.println("Enter the no of puffs bought");
	while(sc.hasNextInt())
	{
	int puffs = sc.nextInt();
	
	int totalPuff = puff*puffs;
	
	System.out.println("Enter the no of cool drinks bought");
	int cool = sc.nextInt();
	int coolDrinks = cool*cooldrink;
	
	System.out.println("Bill Details");
	System.out.println("No of pizzas"+"\n"+pizz);
	System.out.println("No of puffs"+"\n"+puffs);
	System.out.println("No of cool drinks"+"\n"+cool);
	int total = totalPizza+totalPuff+coolDrinks;
	System.out.println("Total Price"+"\n"+total);
	System.out.println("ENJOY THE SHOW!!!");

	}
	}
	}
