#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int a, b, n;
        cin >> a >> b >> n;
        int pow2 = 1;
        int sum = a + b * pow2;
        cout << sum;
        for(int j = 1; j < n; ++j) {
            pow2 *= 2;
            sum += b * pow2;
            cout << " " << sum;
        }
        cout << endl;
    }
    return 0;
}
