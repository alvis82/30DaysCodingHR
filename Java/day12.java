import java.util.*;

class Student{
    protected String firstName;
    protected String lastName;
    protected int phone;

    Student(String firstName,String lastName,int phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;

   }

   public void display(){ // display the details of the student
        System.out.println("First Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nPhone: " + phone);
   }

}

class Grade extends Student {

    private int score;

    Grade(String firstName, String lastName, int phone, int score) {
        super(firstName, lastName, phone);
        this.score = score;
    }

    public char calculate() {
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

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int phone = sc.nextInt();
        int score = sc.nextInt();
        Student stu = new Grade(firstName, lastName, phone, score);
        stu.display();
        Grade g = (Grade)stu;
        System.out.println("Grade: " + g.calculate());

    }
}
