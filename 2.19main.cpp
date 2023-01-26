//Excercise 2.19: Arithmetic, Smallest and Largest
#include <iostream>

int main()
{	// variable initialization
	int number1{ 0 };
	int number2{ 0 };
	int number3{ 0 };
	int sum{ 0 };
	int average{ 0 };
	int product{ 0 };
	int smallest{ 0 };
	int largest{ 0 };

	//user input
	std::cout << "Please Enter First Integer\n";
	std::cin >> number1;

	std::cout << "Please Enter Second Integer\n";
	std::cin >> number2;

	std::cout << "Please Enter Third Integer\n";
	std::cin >> number3;
	// end of use input

	//beginning of if-else integer size comparison statments
	if (number1 > number2 && number1 > number3)
	{
		largest = number1;
		if (number2 > number3)
		{
			smallest = number3;
		}
		else
		{
			smallest = number2;
		}
	}
	if (number2 > number1 && number2 > number3)
	{
		largest = number2;
		if (number1 > number3)
		{
			smallest = number3;
		}
		else
		{
			smallest = number1;
		}
	}
	if (number3 > number2 && number3 > number1)
	{
		largest = number3;
		if (number2 > number1)
		{
			smallest = number1;
		}
		else
		{
			smallest = number2;
		}
	}
	//end of integer size comparison

	//calculations
	sum = number1 + number2 + number3;
	average = sum / 3;
	product = number1 * number2 * number3;

	//outputs
	std::cout << "The sum is " << sum << std::endl;
	std::cout << "The average is " << average << std::endl;
	std::cout << "The product is " << product << std::endl;
	if (smallest == 0 && largest == 0)
	{
		std::cout << "The numbers are all the same!" << std::endl;
	}
	else 
	{
		std::cout << "The smallest is " << smallest << std::endl;
		std::cout << "The largest is " << largest << std::endl;
	}

}