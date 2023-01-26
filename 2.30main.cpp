//Exercise 2.90: Body Mass Index Calculator
#include <iostream>

int main()
{	//body statistic variable initialization
	double weight{ 0 };
	double height{ 0 };
	//choice variable for measurement system used
	int choice{ 0 };

	std::cout << "Please enter 1 for imperial or enter 2 for metric" << std::endl;
	std::cin >> choice;
	//imperial system if statement
	if (choice == 1) 
	{
		std::cout << "Please enter your weight in Lbs" << std::endl;
		std::cin >> weight;
		std::cout << "Please enter your height in Inches" << std::endl;
		std::cin >> height;
		double bmiimp = (weight * 703) / (height * height);
		std::cout << "\nYour BMI is " << bmiimp << std::endl;
	}
	//metric system if statement
	if (choice == 2)
	{
		std::cout << "Please enter your weight in Kg" << std::endl;
		std::cin >> weight;
		std::cout << "Please enter your height in Meters" << std::endl;
		std::cin >> height;
		double bmimet = weight / (height * height);
		std::cout << "Your BMI is " << bmimet << std::endl;
	}

	std::cout << "\nUnderweight: less than 18.5\nnormal:      between 18.5 and 24.9 \noverweight:  between 25 and 29.9 \nobese:       30 or greater" << std::endl;
}