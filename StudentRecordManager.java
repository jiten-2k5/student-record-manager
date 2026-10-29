
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Record Manager ---");
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
