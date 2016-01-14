#include <vector>
#include <iostream>

using namespace std;

class Difference {
private:
    vector<int> elements;

public:
    int maximumDifference;

    Difference(vector<int> nums) {
        for(auto num: nums) {
            elements.push_back(num);
        }
    }

    void computeDifference() {
        int min = 100;
        int max = 0;
        for(auto num: elements) {
            if(min > num) min = num;
            if(max < num) max = num;
        }

        maximumDifference = max - min;
    }
};

int main() {
    int N;
    cin >> N;

    vector<int> a;
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        a.push_back(e);
    }

    Difference d(a);
    d.computeDifference();
    cout << d.maximumDifference;

    return 0;
}
