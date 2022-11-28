package com.example.calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("WE GIVE YOU DIET PLAN BASED ON YOUR BMI");

		int choice = getChoice();
		int n1 = 0, n2 = 0;
		char ch;
	    while(choice != 7) {
	    	switch (choice) {
			case 1:
				System.out.println("The Body Mass Index (BMI) Calculator can be used to calculate BMI value and corresponding weight status while taking age into consideration.\n");
				System.out.println("Enter your height in meter: ");
				double height = sc.nextDouble();
				System.out.println("Enter your weight in kg: ");
				double weight = sc.nextDouble();
				System.out.println(new BmiCalculator().calculate(height, weight));
				System.out.println();
				break;
			case 2:
				System.out.println("The Basal Metabolic Rate (BMR) Calculator estimates your basal metabolic rate—the amount of energy expended while at rest in a neutrally temperate environment\n");
				System.out.println("Age (15-80): ");
				int age = sc.nextInt();
				System.out.println("Gender (M/F): " );
				char gender = sc.next().charAt(0);
				System.out.println("Height (cm): ");
				double h = sc.nextDouble();
				System.out.println("Weight (kg): ");
				double w = sc.nextDouble();
				System.out.println(new BmrCalculator().calculate(age,gender,h,w));
				System.out.println();
				break;
			case 3:
				System.out.println("Calculate CALORIES required per activity level");
			    System.out.println("Age (15-80): ");
			    age = sc.nextInt();
			    System.out.println("Gender (M/F): " );
			    gender = sc.next().charAt(0);
			    System.out.println("Height (cm): ");
			    h = sc.nextDouble();
			    System.out.println("Weight (kg): ");
			    w = sc.nextDouble();
			    System.out.println("Activity Level: ");
			    System.out.println("1. Sedentary: little or no exercise ");
			    System.out.println("2. Light exercise (Exercise 1-3 times/week)");
			    System.out.println("3. Exercise 4-5 times/week");
			    System.out.println("4. Daily exercise or intense exercise 3-4 times/week");
			    System.out.println("5. Very heavy exercise (twice per day, extra heavy workouts)");
			    System.out.print("Enter your choice: ");
			    int activity = sc.nextInt();
				System.out.println(new CaloriesPerActivity().calculate(age, gender, h, w, activity));
				System.out.println();
				break;
			case 4:
				System.out.println("The Ideal Weight Calculator computes ideal body weight (IBW) ranges based on height, gender, and age. The idea of finding the IBW using a formula has been sought after by many experts for a long time. Currently, there persist several popular formulas, and our Ideal Weight Calculator provides their results for side-to-side comparisons.");
				System.out.println("Age (2-80): ");
				int age1 = sc.nextInt();
				System.out.println("Gender (M/F): ");
				char gender1 = sc.next().charAt(0);
				System.out.println("Height (in cm): ");
				double height1 = sc.nextDouble();
				System.out.println(new checkIdealWeight().calculate(age1,gender1,height1));
				System.out.println();
				break;

			default:
				System.out.println("Sorry! Cant be processed!");
				System.out.println();
				break;
			}
	    	choice = getChoice();
	    }
    }
	
	public static int getChoice() {
		System.out.println("1. Know meal Plan based on BMI");
		System.out.println("2. Know your BMR");
		System.out.println("3. Know calories spent per exercise");
		System.out.println("4. What should be the ideal weight for your height and weight");
		System.out.println("5. Exit");
		System.out.println();

		System.out.print("Enter your choice: ");
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    return choice;
	}
}