import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(85);
        scores.add(70);
        scores.add(95);
        scores.add(60);
        scores.add(45);
        scores.add(88);
        scores.add(92);
        scores.add(76);
        scores.add(100);
        scores.add(55);
        scores.add(67);
        scores.add(90);
        scores.add(83);
        scores.add(49);
        scores.add(85);

        Integer choice;

        do {

            IO.println("\n========== SCORE MANAGEMENT SYSTEM ==========");
            IO.println("1. Display Scores");
            IO.println("2. Display Statistics");
            IO.println("3. Score Classification");
            IO.println("4. Search Score");
            IO.println("5. Update Score");
            IO.println("6. Remove Score by Value");
            IO.println("7. Remove Score by Index");
            IO.println("8. Sort and Reverse Scores");
            IO.println("9. Clear All Scores");
            IO.println("10. Exit");

            IO.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    displayScores(scores);
                    break;

                case 2:

                    displayStatistics(scores);
                    break;

                case 3:

                    classifyScores(scores);
                    break;

                case 4:

                    IO.print("Enter score to search: ");
                    Integer searchScore = sc.nextInt();

                    searchScore(scores, searchScore);
                    break;

                case 5:

                    IO.print("Enter index: ");
                    Integer index = sc.nextInt();

                    IO.print("Enter new score: ");
                    Integer newScore = sc.nextInt();

                    updateScore(scores, index, newScore);

                    IO.println("\nUpdated Scores:");
                    displayScores(scores);
                    break;

                case 6:

                    IO.print("Enter score value to remove: ");
                    Integer removeValue = sc.nextInt();

                    removeByValue(scores, removeValue);

                    IO.println("\nUpdated Scores:");
                    displayScores(scores);
                    break;

                case 7:

                    IO.print("Enter index to remove: ");
                    Integer removeIndex = sc.nextInt();

                    removeByIndex(scores, removeIndex);

                    IO.println("\nUpdated Scores:");
                    displayScores(scores);
                    break;

                case 8:

                    sortAndReverse(scores);
                    break;

                case 9:

                    clearScores(scores);
                    break;

                case 10:

                    IO.println("Program Ended.");
                    break;

                default:

                    IO.println("Invalid Choice.");
            }

        } while (choice != 10);

        sc.close();
    }

    public static void displayScores(ArrayList<Integer> scores) {

        IO.println("Total Scores: " + scores.size());

        for (Integer i = 0; i < scores.size(); i++) {

            IO.println("Score " + i + ": " + scores.get(i));
        }
    }

    public static void displayStatistics(ArrayList<Integer> scores) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        Integer total = 0;
        Integer highest = scores.get(0);
        Integer lowest = scores.get(0);

        for (Integer score : scores) {

            total += score;

            if (score > highest) {

                highest = score;
            }

            if (score < lowest) {

                lowest = score;
            }
        }

        Double average = total.doubleValue() / scores.size();

        IO.println("Total Score: " + total);
        IO.println("Average Score: " + average);
        IO.println("Highest Score: " + highest);
        IO.println("Lowest Score: " + lowest);
    }

    public static void classifyScores(ArrayList<Integer> scores) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        Integer passed = 0;
        Integer failed = 0;
        Integer excellent = 0;
        Integer low = 0;

        for (Integer score : scores) {

            if (score >= 60) {

                passed++;

            } else {

                failed++;
            }

            if (score >= 90) {

                excellent++;
            }

            if (score < 50) {

                low++;
            }
        }

        IO.println("Passed: " + passed);
        IO.println("Failed: " + failed);
        IO.println("Excellent: " + excellent);
        IO.println("Low Grades: " + low);
    }

    public static void searchScore(
            ArrayList<Integer> scores,
            Integer value) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        Boolean found = false;
        Integer firstIndex = -1;
        Integer occurrences = 0;

        for (Integer i = 0; i < scores.size(); i++) {

            if (scores.get(i).equals(value)) {

                if (!found) {

                    firstIndex = i;
                    found = true;
                }

                occurrences++;
            }
        }

        if (found) {

            IO.println("Score Found.");
            IO.println("First Position: " + firstIndex);
            IO.println("Occurrences: " + occurrences);

        } else {

            IO.println("Score not found.");
        }
    }

    public static void updateScore(
            ArrayList<Integer> scores,
            Integer index,
            Integer newScore) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        if (index >= 0 && index < scores.size()) {

            scores.set(index, newScore);

            IO.println("Score updated successfully.");

        } else {

            IO.println("Invalid index.");
        }
    }

    public static void removeByValue(
            ArrayList<Integer> scores,
            Integer value) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        if (scores.remove(value)) {

            IO.println("Score removed successfully.");

        } else {

            IO.println("Score not found.");
        }
    }

    public static void removeByIndex(
            ArrayList<Integer> scores,
            Integer index) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        if (index >= 0 && index < scores.size()) {

            scores.remove(index.intValue());

            IO.println("Score removed successfully.");

        } else {

            IO.println("Invalid index.");
        }
    }

    public static void sortAndReverse(
            ArrayList<Integer> scores) {

        if (scores.isEmpty()) {

            IO.println("No scores available.");
            return;
        }

        ArrayList<Integer> sortedScores =
                new ArrayList<>(scores);

        Collections.sort(sortedScores);

        IO.println("Ascending:");
        IO.println(sortedScores);

        Collections.reverse(sortedScores);

        IO.println("Descending:");
        IO.println(sortedScores);
    }

    public static void clearScores(
            ArrayList<Integer> scores) {

        scores.clear();

        IO.println("After Clear:");
        IO.println(scores);

        IO.println("Is Empty: " + scores.isEmpty());
    }

}
