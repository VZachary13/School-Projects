//Exercise 2.29: Table
#include <iostream>

int main()
{
	std::cout << "integer square cube" << std::endl;
	//for loop designed to go from 0 to 10
	for (int i = 0; i <= 10; i++)
	{
		//output and square/cube calculations
		//single tab for spacing
		std::cout << i << "	" << i * i << "	" << i * i * i << std::endl;
	}
	return 0;
}