#include <iostream>
#include <vector>

using namespace std;

template <typename T> void printArray(vector<T> vT) {
    for(auto elem: vT) {
        cout << elem << endl;
    }
}

int main() {
    vector<int> vInt = {1, 2, 3};
    vector<string> vString = {"Hello", "World"};

    printArray<int>(vInt);
    printArray<string>(vString);

    return 0;
}
