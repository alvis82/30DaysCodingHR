#include <iostream>

using namespace std;

class Student {
protected:
    string firstName;
    string lastName;
    int phone;

public:
    Student(string firstName, string lastName, int phone)
    : firstName(firstName), lastName(lastName), phone(phone) {}

    void display() {
        cout << "First Name: " << firstName
             << "\nLast Name: " << lastName
             << "\nPhone: " << phone;
    }
};

class Grade : public Student{
private:
    int score;

public:
    Grade(string firstName, string lastName, int phone, int score)
    : Student(firstName, lastName, phone), score(score) {}

    char calculate() {
        if(score < 40) {
            return 'D';
        } else if(score < 60) {
            return 'B';
        } else if(score < 75) {
            return 'A';
        } else if(score < 90) {
            return 'E';
        } else {
            return 'O';
        }
    }
};

int main() {
    string firstName, lastName;
    int score, phone;
    cin >> firstName >> lastName >> phone >> score;
    Student *stu = new Grade(firstName, lastName, phone, score);
    stu->display();
    Grade *g = (Grade*)stu;
    cout << "\nGrade: " << g->calculate();
    return 0;
}
