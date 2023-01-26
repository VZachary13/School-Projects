#include <iostream>

using namespace std;

int main() {
	// variable declaration
	int accNumber = 0;
	double balance = 0;
	double charges = 0;
	double credits = 0;
	double credLimit = 0; 

	//begin while loop
	cout << "please enter your account number (or -1 to quit) " << endl;
	cin >> accNumber;
	while (accNumber > -1) {
		// begin user inputs
		cout << "please enter your balance at the start of the month " << endl;
		cin >> balance;
		cout << "please enter your total charges for this month " << endl;
		cin >> charges;
		cout << "please enter your total credits for this month " << endl;
		cin >> credits;
		cout << "please enter your credit limit " << endl;
		cin >> credLimit;
		// end user inputs
		// begin calculations
		double newBalance = balance + charges - credits;
		cout << "New balance is " << newBalance << endl;
		if (newBalance > credLimit) {
			cout << "Account:      " << accNumber << endl;
			cout << "Credit limit: " << credLimit << endl;
			cout << "Balance:      " << newBalance << endl;
			cout << "Credit Limit Exceeded." << endl;
		}
		//end calculations
		cout << "please enter your account number (or -1 to quit) " << endl;
		cin >> accNumber;


	}
	//end while loop
}