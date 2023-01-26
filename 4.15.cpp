#include <iostream>

using namespace std;

int main() {
	//weekly pay declaration
	double minPay = 200.00;
	double comRate = .09;
	double sales = 0;

	while (sales > -1) {
		cout << "Enter sales in dollars (-1 to end): ";
		cin >> sales;
		if (sales > -1) {
			cout << "Salary is: $" << minPay + (comRate * sales) << endl;
		}
		cout << "" << endl;
		
	}
}