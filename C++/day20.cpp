#include <string>
#include <vector>
#include <iostream>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    vector<string> words;
    string temp = "";
    for(char c: str) {
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            temp += c;
        } else if(temp.length() != 0) {
            words.push_back(temp);
            temp = "";
        }
    }

    if(temp.length() != 0) {
        words.push_back(temp);
    }

    cout << words.size() << endl;
    for(auto word: words) {
        cout << word << endl;
    }

    return 0;
}
