#include <cmath>
#include <cstdio>
#include <iostream>

using namespace std;

int main() {
    double M, T, X;
    cin >> M >> T >> X;
    int price = (int) round(M * (1 + (T + X) / 100));
    printf("The final price of the meal is $%d.", price);
    return 0;
}
