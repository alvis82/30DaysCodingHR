#include <iostream>

using namespace std;

int main() {
    int returnDay, returnMonth, returnYear;
    int expectedDay, expectedMonth, expectedYear;
    cin >> returnDay >> returnMonth >> returnYear;
    cin >> expectedDay >> expectedMonth >> expectedYear;
    if(returnYear > expectedYear) {
        cout << 10000 << endl;
    } else if(returnYear == expectedYear &&
              returnMonth > expectedMonth) {
        cout << 500 * (returnMonth - expectedMonth) << endl;
    } else if(returnYear == expectedYear &&
              returnMonth == expectedMonth &&
              returnDay > expectedDay) {
        cout << 15 * (returnDay - expectedDay) << endl;
    } else {
        cout << 0 << endl;
    }

    return 0;
}
