#include <iostream>

using namespace std;

int find_gcd(int a,int b){
    if(b == 0) return a;
    if(a < b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
    return find_gcd(b, a % b);
}

int main() {
    int a, b;
    cin >> a >> b;
    cout << find_gcd(a, b);
    return 0;
}
