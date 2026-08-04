import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<String>();

        Integer choice;
        Integer index;
        String studentName;

        students.add("Ali");
        students.add("Sara");
        students.add("Omar");
        students.add("Ahmed");
        students.add("Khalid");
        students.add("Fatima");
        students.add("Aisha");
        students.add("Mohammed");
        students.add("Salim");
        students.add("Noor");

        do {

            IO.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            IO.println("1. Display Students");
            IO.println("2. Add Student");
            IO.println("3. Update Student");
            IO.println("4. Search Student");
            IO.println("5. Remove Student");
            IO.println("6. Student Analysis");
            IO.println("7. Sort Students");
            IO.println("8. Exit");
            IO.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    displayStudents(students);
                    break;

                case 2:

                    IO.println("\n1. Add at End");
                    IO.println("2. Add at Specific Position");
                    IO.print("Choice: ");

                    Integer addChoice = sc.nextInt();
                    sc.nextLine();

                    IO.print("Enter student name: ");
                    studentName = sc.nextLine();

                    if (addChoice == 1) {

                        addStudent(students, studentName);

                    } else if (addChoice == 2) {

                        IO.print("Enter position: ");
                        index = sc.nextInt();
                        sc.nextLine();

                        addStudentAtPosition(
                                students,
                                index,
                                studentName);

                    } else {

                        IO.println("Invalid choice.");
                    }

                    break;

                case 3:

                    IO.print("Enter student index: ");
                    index = sc.nextInt();
                    sc.nextLine();

                    IO.print("Enter new name: ");
                    studentName = sc.nextLine();

                    updateStudent(
                            students,
                            index,
                            studentName);

                    break;

                case 4:

                    IO.print("Enter student name to search: ");
                    studentName = sc.nextLine();

                    searchStudent(
                            students,
                            studentName);

                    break;

                case 5:

                    IO.println("\n1. Remove by Name");
                    IO.println("2. Remove by Index");
                    IO.print("Choice: ");

                    Integer removeChoice = sc.nextInt();
                    sc.nextLine();

                    if (removeChoice == 1) {

                        IO.print("Enter student name: ");
                        studentName = sc.nextLine();

                        removeStudentByName(
                                students,
                                studentName);

                    } else if (removeChoice == 2) {

                        IO.print("Enter index: ");
                        index = sc.nextInt();

                        removeStudentByIndex(
                                students,
                                index);

                    } else {

                        IO.println("Invalid choice.");
                    }

                    break;

                case 6:

                    analyzeStudents(students);
                    break;

                case 7:

                    sortStudents(students);
                    break;

                case 8:

                    IO.println("Program Ended.");
                    break;

                default:

                    IO.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }

    public static void displayStudents(
            ArrayList<String> students) {

        IO.println("\n========== STUDENT LIST ==========");

        IO.println("Total Students: " + students.size());

        for (Integer i = 0; i < students.size(); i++) {

            IO.println("Student " + i + ": " + students.get(i));
        }
    }

    public static void addStudent(
            ArrayList<String> students,
            String studentName) {

        students.add(studentName);

        IO.println("Student added successfully.");

        displayStudents(students);
    }

    public static void addStudentAtPosition(
            ArrayList<String> students,
            Integer index,
            String studentName) {

        if (index >= 0 && index <= students.size()) {

            students.add(index, studentName);

            IO.println("Student added successfully.");

        } else {

            IO.println("Invalid index.");
        }

        displayStudents(students);
    }

    public static void updateStudent(
            ArrayList<String> students,
            Integer index,
            String studentName) {

        if (index >= 0 && index < students.size()) {

            students.set(index, studentName);

            IO.println("Student updated successfully.");

        } else {

            IO.println("Invalid index.");
        }

        displayStudents(students);
    }

    public static void searchStudent(
            ArrayList<String> students,
            String studentName) {

        if (students.contains(studentName)) {

            IO.println("Student found.");
            IO.println("Index: " + students.indexOf(studentName));

        } else {

            IO.println("Student not found.");
        }
    }

    public static void removeStudentByName(
            ArrayList<String> students,
            String studentName) {

        if (students.remove(studentName)) {

            IO.println("Student removed successfully.");

        } else {

            IO.println("Student not found.");
        }

        displayStudents(students);
    }

    public static void removeStudentByIndex(
            ArrayList<String> students,
            Integer index) {

        if (index >= 0 && index < students.size()) {

            students.remove(index);

            IO.println("Student removed successfully.");

        } else {

            IO.println("Invalid index.");
        }

        displayStudents(students);
    }

    public static void analyzeStudents(
            ArrayList<String> students) {

        IO.println("\n========== STUDENT ANALYSIS ==========");

        IO.println("Total Students: " + students.size());

        IO.println("Is Empty: " + students.isEmpty());

        if (!students.isEmpty()) {

            IO.println("First Student: " + students.get(0));

            IO.println("Last Student: " + students.get(students.size() - 1));
        }
    }

    public static void sortStudents(
            ArrayList<String> students) {

        ArrayList<String> sortedStudents =
                new ArrayList<String>(students);

        Collections.sort(sortedStudents);

        IO.println("\nOriginal List:");
        IO.println(students);

        IO.println("\nSorted List:");
        IO.println(sortedStudents);
    }
}