package com.jspider.cardekhocasestudy.main;

import java.util.Scanner;

import com.jspider.cardekhocasestudy.operations.CarOperations;

public class CarMain {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CarOperations carOperations =new CarOperations();
		boolean flag = true;
		
		while (flag){
			System.out.println("Enter 1 to add car details. \nEnter 2 to remove car details.\nEnter 3 to update car details.\nEnter 4 to search car details.\nEnter 5 for exit");
			System.out.println("Enter your choice.");
			switch(scanner.nextInt()) {
			case 1 :
				carOperations.add(scanner);
				break;
			case 2:
				carOperations.remove(scanner);
				break;
			case 3:
				carOperations.update(scanner);
				break;
			case 4:
				carOperations.search(scanner);
				break;
			case 5:
				flag=false;
			default:
				System.out.println("Invalid car id");
			
				
		}
		
	}
	}
}
		


	
	

