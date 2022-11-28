package com.example.calculator;


import java.sql.SQLOutput;
import java.util.Scanner;

public class BmiCalculator {
    public double calculateBmi(double ht, double wt) {
    	double bmi;
    	if(ht > 0 && wt > 0)
    		bmi = wt/(ht*ht);
    	else
    		bmi = -1;

    	return bmi;
    }

    public String calculate(double height, double weight)
    {
    	double bmi = new BmiCalculator().calculateBmi(height, weight);
    	if (bmi > 0 && bmi < 18.5) {

			System.out.println("UNDERWEIGHT");

			System.out.println("PROBLEMS Caused in underweight Individuals");
			System.out.println("If you are underweight, you may be at greater risk of certain health conditions, including malnutrition, osteoporosis, decreased muscle strength, hypothermia and lowered immunity. You are more likely to die at a younger age.\n" +
					"\n" +
					"Underweight women have less chance of becoming pregnant than women who are a healthy weight.");


			System.out.println("YOUR DIET PLAN");

			System.out.print("Breakfast (8:00-8:30AM)");
			System.out.print("2 egg brown bread sandwich + green chutney + 1 cup milk + 3 cashews + 4 almonds + 2 walnuts");

			System.out.println();

			System.out.print("Mid-Meal (11:00-11:30AM)");
			System.out.println("1 cup banana shake");

			System.out.println();

			System.out.print("Lunch (2:00-2:30PM)");
			System.out.print("1 cup arhar dal + 1 cup potato curry + 3 chapatti + 1/2 cup rice + 1/2 cup low fat curd + salad");

			System.out.println();

			System.out.print("Evening (4:00-4:30PM)");
			System.out.print("1 cup strawberry smoothie + 1 cup vegetable poha");

			System.out.println();

			System.out.print("Dinner (8:00-8:30PM)");
			System.out.println("1.5 cup chicken curry + 3 chapatti + salad");


          return "Underweight. Your BMI is " + bmi;
	    } else if (bmi >= 18.5 && bmi < 25) {

			System.out.println("HEALTHY!!! CONGRATULATIONS!!!!");

			System.out.println("Just take care of your heath and stay the way you are");

			System.out.println("YOUR DIET PLAN");
			System.out.println("LETS GIVE YOU SOME IMPORTANT HEALTHY DIET ACCORDING TO WHO");

			System.out.println("A healthy diet helps to protect against malnutrition in all its forms, as well as noncommunicable diseases (NCDs), including diabetes, heart disease, stroke and cancer.\n" +
					"Unhealthy diet and lack of physical activity are leading global risks to health.\n" +
					"Healthy dietary practices start early in life – breastfeeding fosters healthy growth and improves cognitive development, and may have longer term health benefits such as reducing the risk of becoming overweight or obese and developing NCDs later in life.\n" +
					"Energy intake (calories) should be in balance with energy expenditure. To avoid unhealthy weight gain, total fat should not exceed 30% of total energy intake (1, 2, 3). Intake of saturated fats should be less than 10% of total energy intake, and intake of trans-fats less than 1% of total energy intake, with a shift in fat consumption away from saturated fats and trans-fats to unsaturated fats (3), and towards the goal of eliminating industrially-produced trans-fats (4, 5, 6).\n" +
					"Limiting intake of free sugars to less than 10% of total energy intake (2, 7) is part of a healthy diet. A further reduction to less than 5% of total energy intake is suggested for additional health benefits (7).\n" +
					"Keeping salt intake to less than 5 g per day (equivalent to sodium intake of less than 2 g per day) helps to prevent hypertension, and reduces the risk of heart disease and stroke in the adult population (8).\n" +
					"WHO Member States have agreed to reduce the global population’s intake of salt by 30% by 2025; they have also agreed to halt the rise in diabetes and obesity in adults and adolescents as well as in childhood overweight by 2025 (9, 10).");


	          return "Healthy. Your BMI is " + bmi;
	    } else if (bmi >= 25 && bmi < 30) {

			System.out.println("YOU ARE OVERWEIGHT!!!");

			System.out.println("Diseases caused in overweight individuals");
			System.out.println("All-causes of death (mortality).\n" +
					"High blood pressure (hypertension).\n" +
					"High LDL cholesterol, low HDL cholesterol, or high levels of triglycerides (dyslipidemia).\n" +
					"Type 2 diabetes.\n" +
					"Coronary heart disease.\n" +
					"Stroke.\n" +
					"Gallbladder disease.\n" +
					"Osteoarthritis (a breakdown of cartilage and bone within a joint).\n" +
					"Sleep apnea and breathing problems.\n" +
					"Many types of cancer.\n" +
					"Low quality of life.\n" +
					"Mental illness such as clinical depression, anxiety, and other mental disorders4,5.\n" +
					"Body pain and difficulty with physical functioning");

			System.out.println("Our customised Meal Plan for you");
			System.out.println("Low-Carb Meal Plan\n" +
					"In a low-carb meal, high-carbohydrate foods are limited, and those rich in protein and fat get the priority. Therefore, grains, starchy vegetables, pasta, bread, processed meats, and high carb fruits are avoided or eaten in small amounts. The low carb meal plans can get formulated in multiple forms, depending on the type and quantity of carbs. \n" +
					"\n" +
					"In a low-carb meal plan, the person is advised to have a limited quantity of carbs that would be just the amount required for a person to survive, and instead various foods rich in protein are often added to balance out the nutritional profile. Low carb meals include cutting down on sugar and carbs while getting sufficient protein intake. It is widely adopted to lose weight. Additionally, it encourages the intake of healthy fats. Restricting added sugar and carbs leads to stable blood sugar levels. In addition, it causes a healthy decline in the fat-storing hormone insulin, making it simpler to burn fat stored in the body. \n" +
					"\n" +
					"Furthermore, having a good amount of protein helps to feel satiated since proteins take more time to digest and hence stay in your stomach for long which leads to reduced food consumption making calorie deficit easier. When calorie intake is low, it automatically aids in weight loss. Low-carb diets have other health benefits associated with them. As per studies, it lowers the risk of type 2 diabetes and metabolic syndrome.");


			System.out.println("Foods to Eat\n" +
					"Meat: Beef, lamb, pork, chicken breast.\n" +
					"Eggs: Omega-3 rich or pastured eggs.\n" +
					"Vegetables: Spinach, broccoli, cauliflower, carrots\n" +
					"Fruits: Apples, oranges, pears, blueberries, strawberries\n" +
					"Fish: Salmon, trout, catfish, haddock\n" +
					"Nuts and seeds: Almonds, walnuts, sunflower seeds, nut butter\n" +
					"High-fat dairy: Cheese, butter, heavy cream, yoghourt\n" +
					"Fats and oils: Coconut oil, butter, olive oil and fish oil");

			System.out.println("Foods to Avoid\n" +
					"Sugar: Soft drinks, fruit juices, candy, ice cream and other food items with added sugar. \n" +
					"Refined grains: Wheat, rice, barley and rye, bread, cereal and pasta.\n" +
					"Trans fats: Hydrogenated or partially hydrogenated oils.\n" +
					"Highly processed foods\n" +
					"Starchy vegetables");


	          return "Overweight. Your BMI is " + bmi;
	    } else if (bmi >= 30) {

			System.out.println("YOU ARE OBESE!! But Dont worry, we will take care!!");

			System.out.println("CAUSES");
			System.out.println("Although there are genetic, behavioral, metabolic and hormonal influences on body weight, obesity occurs when you take in more calories than you burn through normal daily activities and exercise. Your body stores these excess calories as fat.\n" +
					"\n" +
					"In the United States, most people's diets are too high in calories — often from fast food and high-calorie beverages. People with obesity might eat more calories before feeling full, feel hungry sooner, or eat more due to stress or anxiety.\n" +
					"\n" +
					"Many people who live in Western countries now have jobs that are much less physically demanding, so they don't tend to burn as many calories at work. Even daily activities use fewer calories, courtesy of conveniences such as remote controls, escalators, online shopping and drive-through banks.");

			System.out.println("RISK FACTORS");
			System.out.println("Complications\n" +
					"People with obesity are more likely to develop a number of potentially serious health problems, including:\n" +
					"\n" +
					"Heart disease and strokes. Obesity makes you more likely to have high blood pressure and abnormal cholesterol levels, which are risk factors for heart disease and strokes.\n" +
					"Type 2 diabetes. Obesity can affect the way the body uses insulin to control blood sugar levels. This raises the risk of insulin resistance and diabetes.\n" +
					"Certain cancers. Obesity may increase the risk of cancer of the uterus, cervix, endometrium, ovary, breast, colon, rectum, esophagus, liver, gallbladder, pancreas, kidney and prostate.\n" +
					"Digestive problems. Obesity increases the likelihood of developing heartburn, gallbladder disease and liver problems.\n" +
					"Sleep apnea. People with obesity are more likely to have sleep apnea, a potentially serious disorder in which breathing repeatedly stops and starts during sleep.\n" +
					"Osteoarthritis. Obesity increases the stress placed on weight-bearing joints, in addition to promoting inflammation within the body. These factors may lead to complications such as osteoarthritis.\n" +
					"Severe COVID-19 symptoms. Obesity increases the risk of developing severe symptoms if you become infected with the virus that causes coronavirus disease 2019 (COVID-19). People who have severe cases of COVID-19 may require treatment in intensive care units or even mechanical assistance to breathe.");

			System.out.println("DIET PLAN FOR YOU \n");
			System.out.println("Breakfast (8:00-8:30AM)\t3 egg whites + 1 toasted brown bread + 1/2 cup low fat milk (no sugar)\n" +
					"Mid-Meal (11:00-11:30AM)\t1 cup papaya\n" +
					"Lunch (2:00-2:30PM)\t1 cup arhar dal + 1 chapatti + 1/2 cup low fat curd + salad\n" +
					"Evening (4:00-4:30PM)\t1 cup vegetable soup\n" +
					"Dinner (8:00-8:30PM)\t1 cup pumpkin + 1 chapatti + salad");

	          return "Obese. Your BMI is " + bmi;
	    }
    	return "Invalid Inputs";
    }
}
