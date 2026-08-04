import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManagementSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> studentScores;
        Integer choice;
        Integer score;
        Integer index;

        studentScores = new ArrayList<>();

        studentScores.add(85);
        studentScores.add(92);
        studentScores.add(77);
        studentScores.add(90);
        studentScores.add(100);
        studentScores.add(50);
        studentScores.add(81);
        studentScores.add(69);
        studentScores.add(98);
        studentScores.add(70);

        do {

            System.out.println("\n========== SCORE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Display Scores");
            System.out.println("2. Analyze Scores");
            System.out.println("3. Update Score");
            System.out.println("4. Search Score");
            System.out.println("5. Remove Score");
            System.out.println("6. Sort Scores");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    displayScores(studentScores);
                    break;

                case 2:

                    analyzeScores(studentScores);
                    break;

                case 3:

                    System.out.print("Enter Index: ");
                    index = sc.nextInt();

                    System.out.print("Enter New Score: ");
                    score = sc.nextInt();

                    updateScore(studentScores, index, score);
                    break;

                case 4:

                    System.out.print("Enter Score To Search: ");
                    score = sc.nextInt();

                    searchScore(studentScores, score);
                    break;

                case 5:

                    System.out.print("Enter Index To Remove: ");
                    index = sc.nextInt();

                    removeScore(studentScores, index);
                    break;

                case 6:

                    sortScores(studentScores);
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

}
}
