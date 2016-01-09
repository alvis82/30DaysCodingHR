#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    int n;
    cin >> n;
    string name;
    string number;
    unordered_map<string, string> phone_book;
    for(int i = 0; i < n; ++i) {
        cin.ignore();
        getline(cin, name);
        cin >> number;
        phone_book[name] = number;
    }

    cin.ignore();
    while(true) {
        if(!getline(cin, name)) break;

        if(phone_book.find(name) != phone_book.end()) {
            cout << name << "=" << phone_book[name] << endl;
        } else {
            cout << "Not found" << endl;
        }
    }

    return 0;
}
