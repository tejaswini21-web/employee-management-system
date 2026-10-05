package Test;
import java.util.Scanner;

public class demo {

    static Scanner sc = new Scanner(System.in);
    static String name;
    static int age;
    static double salary;

    static void create() {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }

    static void display() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    static void raiseSalary() {
        salary = salary + 1000;
        System.out.println("Salary raised by 1000");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    create();
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    raiseSalary();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

