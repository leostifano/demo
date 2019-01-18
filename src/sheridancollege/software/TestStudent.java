package sheridancollege.software;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student students[] = new Student[3];

        for(int i = 0;i<students.length;i++){
            System.out.print("Enter student name: ");
            students[i] = new Student(in.nextLine());
            System.out.print("Enter ID: ");
            students[i].setID(in.nextInt());
            in = new Scanner(System.in);
        }

        for(int i =0;i<students.length;i++){
            System.out.println("Name " + students[i].getName() + "\nID:" + students[i].getID());
        }




    }
}
