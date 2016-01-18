#include <iostream>
#include <stack>
#include <queue>

using namespace std;

class Palindrome {
private:
    stack<char> mStack;
    queue<char> mQueue;

public:
    void pushCharacter(char ch);
    void enqueueCharacter(char ch);
    char popCharacter();
    char dequeueCharacter();
};

void Palindrome :: pushCharacter(char ch) {
    mStack.push(ch);
}

void Palindrome :: enqueueCharacter(char ch) {
    mQueue.push(ch);
}

char Palindrome :: popCharacter() {
    char ch = mStack.top();
    mStack.pop();
    return ch;
}

char Palindrome :: dequeueCharacter() {
    char ch = mQueue.front();
    mQueue.pop();
    return ch;
}

int main() {
    // Read the string s.
    string s;
    getline(cin, s);

  	// Create the Palindrome class object p.
    Palindrome p;

    // Push all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        p.pushCharacter(s[i]);
    }

    // Enqueue all the characters of string s to queue.
    for (int i = 0; i < s.length(); i++) {
        p.enqueueCharacter(s[i]);
    }

    bool f = true;

    // Pop the top character from stack.
    // Dequeue the first character from queue.
    // Compare both the characters.
    for (int i = 0; i < s.length(); i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            f = false;
            break;
        }
    }

    // Finally print whether string s is palindrome or not.
    if (f) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }

    return 0;
}
