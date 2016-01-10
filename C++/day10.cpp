#include <vector>
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        int num;
        cin >> num;
        vector<int> bin;
        while(num > 0) {
            bin.push_back(num % 2);
            num >>= 1;
        }
        for(auto iter = bin.rbegin(); iter != bin.rend(); ++iter) {
            cout << *iter;
        }
        cout << endl;
    }

    return 0;
}
