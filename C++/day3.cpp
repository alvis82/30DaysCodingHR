#include <iostream>

using namespace std;

int main(){
    int N;
    cin >> N;
    if(N % 2 == 1) {
        cout << "Weird";
    } else if ((N >= 2 && N <= 5) || N > 20) {
        cout << "Not Weird";
    } else {
        cout << "Weird";
    }
    return 0;
}
