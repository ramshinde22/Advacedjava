package com.jspider.cardekhocasestudy.operations;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.cardekhocasestudy.entity.Car;

public class CarOperations {
	ArrayList<Car> arraylist=new ArrayList<Car>();
	Car car = new Car();
	public void add(Scanner scanner) {
		System.out.println("How many cars you want to add?");
		int choice = scanner.nextInt();
		for (int i = 1; i <= choice; i++) {
			System.out.println("Enter Car ID");
			car.setCarId(scanner.nextInt());
			System.out.println("Enter the car name : ");
			car.setName(scanner.next());
			System.out.println("Enter the car brand : ");
			car.setBrand(scanner.next());
			System.out.println("Enter the fuel type : ");
			car.setFual_type(scanner.next());
			System.out.println("Enter the car price : ");
			car.setPrice(scanner.nextDouble());
			arraylist.add(car);
			System.out.println("Car Added Successfully");
		}
		System.out.println(arraylist);
	}
	public void remove(Scanner scanner) {
	System.out.println("Enter Car id to remove the car ");
	boolean  flag = false;
	while(!flag) {
		System.out.println("Enter Id");
		int removeId=scanner.nextInt();
		boolean found=false;
		for(Car cars:arraylist) {
			if (removeId==cars.getCarId()) {
				arraylist.remove(cars);
				System.out.println(cars.toString());
				found=true;
				flag=true;
				System.out.println("Car Removed Successfully!!!!");
				break;
			}
		}
	}
	
}
	
	public void update(Scanner scanner) {
		System.out.println("Enter Old Car id to update");
		boolean update=false;
		while(!update) {
			int oldCarid=scanner.nextInt();
			boolean found=false;
			for(Car cars2:arraylist) {
				if (cars2.getCarId()==oldCarid) {
					System.out.println("Please enter new Id");
					int updateId=scanner.nextInt();
					car.setCarId(updateId);
					System.out.println("Enter New Car Name");
					String updateName=scanner.next();
					car.setName(updateName);
					System.out.println("Enter New Car Model");
					String updateBrand=scanner.next();
					car.setBrand(updateBrand);
					System.out.println("Enter the New Car Price");
					double updatePrice=scanner.nextDouble();
					car.setPrice(updatePrice);
					System.out.println("Car Deatails Updated Sucessfully");
					found=true;
					update=true;
					break;
				}
			}

		}
		
		
	}

	public void search(Scanner scanner) {
		System.out.println("Watch Your Car Collection");
		boolean found=false;
		while(!found) {
			System.out.println("Enter Car id ");
			boolean search=false;
			int searchId=scanner.nextInt();
			
			for(Car cars3:arraylist) {
				if (cars3.getCarId()==searchId) {
					System.out.println(cars3);
					search=true;
					found=true;
					break;
				}
			}
		}
	}
}
