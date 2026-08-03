import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] studentNames;
        Integer studentCount;
        Integer choice;
        String studentName;
        Integer index;

        studentNames = new String[10];

        studentNames[0] = "Almajd";
        studentNames[1] = "Abdulrahman";
        studentNames[2] = "Abdulaziz";
        studentNames[3] = "Suliman";
        studentNames[4] = "Mohammed";

        do {

            IO.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            IO.println("1. Display Students");
            IO.println("2. Add Student");
            IO.println("3. Search Student");
            IO.println("4. Update Student");
            IO.println("5. Remove Student");
            IO.println("6. Sort Students");
            IO.println("7. Exit");
            IO.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    displayStudents(studentNames, studentCount);
                    break;

                case 2:

                    System.out.print("Enter Student Name: ");
                    studentName = sc.nextLine();

                    studentCount = addStudent(
                            studentNames,
                            studentCount,
                            studentName);

                    break;

                case 3:

                    System.out.print("Enter Student Name: ");
                    studentName = sc.nextLine();

                    searchStudent(
                            studentNames,
                            studentCount,
                            studentName);

                    break;

                case 4:

                    System.out.print("Enter Student Index: ");
                    index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Student Name: ");
                    studentName = sc.nextLine();

                    updateStudent(
                            studentNames,
                            studentCount,
                            index,
                            studentName);

                    break;

                case 5:

                    System.out.print("Enter Student Index: ");
                    index = sc.nextInt();

                    studentCount = removeStudent(
                            studentNames,
                            studentCount,
                            index);

                    break;

                case 6:

                    sortStudents(
                            studentNames,
                            studentCount);

                    System.out.println("Students Sorted Successfully.");
                    break;

                case 7:

                    System.out.println("Program Ended.");
                    break;

                default:

                    System.out.println("Invalid Menu Choice.");
            }

        } while (choice != 7);

        sc.close();
    }

    public static void displayStudents(
            String[] studentNames,
            Integer studentCount) {

        IO.println("\n========== STUDENT LIST ==========");

        for (Integer i = 0; i < studentCount; i++) {

            IO.println((i + 1) + ". " + studentNames[i]);
        }

    }

    public static Integer addStudent(
            String[] studentNames,
            Integer studentCount,
            String studentName){

        if (studentCount < studentNames.length) {
            studentNames[studentCount] = studentName;
            studentCount++;
            IO.println("Student Added Successfully");
        }else {
            IO.println("Student List Is Full.");
        }
        return studentCount;
    }

    public static void searchStudent(
            String[] studentNames,
            Integer studentCount,
            String studentName) {
        
    }
}
