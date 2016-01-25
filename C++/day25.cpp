#include <cmath>
#include <iostream>

using namespace std;

bool is_prime(int n) {
    if(n == 1) return false;

    int sqrt_n = (int)sqrt(n);
    for(int i = 2; i <= sqrt_n; ++i) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int n_of_testcase;
    cin >> n_of_testcase;
    for(int i = 0; i < n_of_testcase; ++i) {
        int testcase;
        cin >> testcase;
        if(is_prime(testcase)) {
            cout << "Prime" << endl;
        } else {
            cout << "Not prime" << endl;
        }
    }
    return 0;
}
