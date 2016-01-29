#include <iostream>
#include <string>

using namespace std;

bool is_funny(string str) {
    int left = 1;
    int right = str.length() - 2;
    while(left <= right) {
        if(abs(str[left - 1] - str[left]) !=
           abs(str[right + 1] - str[right])) {
            return false;
        }
        ++left;
        --right;
    }
    return true;
}

int main() {
    int testcases;
    cin >> testcases;
    cin.ignore();
    for(int i = 0; i < testcases; ++i) {
        string str;
        getline(cin, str);
        if(is_funny(str)) {
            cout << "Funny" << endl;
        } else {
            cout << "Not Funny" << endl;
        }
    }

    return 0;
}
