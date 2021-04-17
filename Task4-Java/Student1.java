package session4;

import java.util.Scanner;

public class Student1 {
    String studName;
    int studAge;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Student Name:");
        studName = scan.nextLine();
        System.out.println("Enter the Student Age:");
        studAge = scan.nextInt();
    }

    void display() {
        System.out.println("Student Name: " + studName);
        System.out.println("Student Age: " + studAge);
    }

    public static void main(String[] args) {
        int ques;
        do {
            Student1 objStudent1 = new Student1();
            objStudent1.input();
            objStudent1.display();
            System.out.println("Tiep tuc? 1/yes 0/no");
            Scanner scan = new Scanner(System.in);
            ques = scan.nextInt();
        } while (ques != 0);
    }
}
