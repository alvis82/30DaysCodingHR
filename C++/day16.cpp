#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> nums;
    for(int i = 0; i < n; ++i) {
        int tmp;
        cin >> tmp;
        nums.push_back(tmp);
    }
    sort(nums.begin(), nums.end());
    int minad = nums[1] - nums[0];
    for(int i = 2; i < n; ++i) {
        if(minad > nums[i] - nums[i - 1]) {
            minad = nums[i] - nums[i - 1];
        }
    }
    for(int i = 1; i < n; ++i) {
        if(minad == nums[i] - nums[i - 1]) {
            cout << nums[i - 1] << " " << nums[i] << " ";
        }
    }
    cout << endl;

    return 0;
}
