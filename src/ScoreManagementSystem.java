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

        IO.println("========== SCORE INFORMATION ==========");
        displayScores(scores);

        IO.println("\n========== SCORE STATISTICS ==========");
        displayStatistics(scores);

        IO.println("\n========== SCORE CLASSIFICATION ==========");
        classifyScores(scores);

        IO.print("\nEnter score to search: ");
        Integer searchScore = sc.nextInt();
        searchScore(scores, searchScore);

        IO.print("\nEnter index to update: ");
        Integer index = sc.nextInt();

        IO.print("Enter new score: ");
        Integer newScore = sc.nextInt();

        updateScore(scores, index, newScore);

        IO.println("\nUpdated Scores:");
        displayScores(scores);

        IO.print("\nEnter score value to remove: ");
        Integer removeValue = sc.nextInt();
        removeByValue(scores, removeValue);

        IO.println("\nScores After Removing By Value:");
        displayScores(scores);

        IO.print("\nEnter index to remove: ");
        Integer removeIndex = sc.nextInt();
        removeByIndex(scores, removeIndex);

        IO.println("\nScores After Removing By Index:");
        displayScores(scores);

        sortAndReverse(scores);


        clearScores(scores);

        sc.close();
    }



    public static void displayScores(ArrayList<Integer> scores) {

        IO.println("Total Scores: " + scores.size());

        for (Integer i = 0; i < scores.size(); i++) {

            IO.println("Score " + i + ": " + scores.get(i));
        }
    }



    public static void displayStatistics(ArrayList<Integer> scores) {

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

        Double average = (Double) total.doubleValue() / scores.size();

        IO.println("Total Score: " + total);
        IO.println("Average Score: " + average);
        IO.println("Highest Score: " + highest);
        IO.println("Lowest Score: " + lowest);
    }



    public static void classifyScores(ArrayList<Integer> scores) {

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

        if (scores.remove(value)) {

            IO.println("Score removed successfully.");

        } else {

            IO.println("Score not found.");
        }
    }



    public static void removeByIndex(
            ArrayList<Integer> scores,
            Integer index) {

        if (index >= 0 && index < scores.size()) {

            scores.remove((int) index);

            IO.println("Score removed successfully.");

        } else {

            IO.println("Invalid index.");
        }
    }



    public static void sortAndReverse(ArrayList<Integer> scores) {

        ArrayList<Integer> sortedScores = new ArrayList<>(scores);

        Collections.sort(sortedScores);

        IO.println("\nAscending:");
        IO.println(sortedScores);

        Collections.reverse(sortedScores);

        IO.println("\nDescending:");
        IO.println(sortedScores);
    }



    public static void clearScores(ArrayList<Integer> scores) {

        scores.clear();

        IO.println("\nAfter Clear:");
        IO.println(scores);

        IO.println("Is Empty: " + scores.isEmpty());
    }

}