import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperationsSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] numbers;
        Integer searchNumber;
        Integer updateIndex;
        Integer updateValue;

        Integer sum;
        Double average;
        Integer highestNumber;
        Integer lowestNumber;

        numbers = new Integer[]{45, 12, 78, 34, 90, 23, 56, 10, 67, 89};

        IO.println("Original Array:");
        displayArray(numbers);

        sum = calculateSum(numbers);
        average = calculateAverage(sum, numbers.length);
        highestNumber = findHighest(numbers);
        lowestNumber = findLowest(numbers);

        IO.println("\n========== ARRAY STATISTICS ==========");
        IO.println("Sum: " + sum);
        IO.println("Average: " + average);
        IO.println("Highest Number: " + highestNumber);
        IO.println("Lowest Number: " + lowestNumber);

        IO.print("\nEnter number to search: ");
        searchNumber = sc.nextInt();

        searchNumber(numbers, searchNumber);

        IO.print("\nEnter index to update (0-9): ");
        updateIndex = sc.nextInt();

        IO.print("Enter new value: ");
        updateValue = sc.nextInt();

        updateArray(numbers, updateIndex, updateValue);

        IO.println("\nArray After Updating:");
        displayArray(numbers);

        reverseArray(numbers);

        IO.println("\nArray After Reversing:");
        displayArray(numbers);

        sortArray(numbers);

        IO.println("\nArray After Sorting:");
        displayArray(numbers);

        sc.close();
    }


    // Display array elements
    public static void displayArray(Integer[] numbers) {

        for (Integer number : numbers) {

            System.out.print(number + " ");
        }

        System.out.println();
    }


    // Calculate sum of array
    public static Integer calculateSum(Integer[] numbers) {

        Integer sum = 0;

        for (Integer number : numbers) {

            sum += number;
        }

        return sum;
    }


    // Calculate average
    public static Double calculateAverage(
            Integer sum,
            Integer size) {

        return (Double) (sum / size);
    }


    // Find highest value
    public static Integer findHighest(Integer[] numbers) {

        Integer highestNumber = numbers[0];

        for (Integer number : numbers) {

            if (number > highestNumber) {

                highestNumber = number;
            }
        }

        return highestNumber;
    }


    // Find lowest value
    public static Integer findLowest(Integer[] numbers) {

        Integer lowestNumber = numbers[0];

        for (Integer number : numbers) {

            if (number < lowestNumber) {

                lowestNumber = number;
            }
        }

        return lowestNumber;
    }


    // Search for a number
    public static void searchNumber(
            Integer[] numbers,
            Integer searchNumber) {

        Boolean found = false;

        for (Integer i = 0; i < numbers.length; i++) {

            if (numbers[i].equals(searchNumber)) {

                System.out.println("Number found at index: " + i);

                found = true;
                break;
            }
        }


        if (!found) {

            System.out.println("Number not found.");
        }
    }


    // Update array value
    public static void updateArray(
            Integer[] numbers,
            Integer index,
            Integer newValue) {


        if (index >= 0 && index < numbers.length) {

            numbers[index] = newValue;

            System.out.println("Value updated successfully.");

        } else {

            System.out.println("Invalid index.");
        }
    }


    // Reverse array
    public static void reverseArray(Integer[] numbers) {

        Integer start = 0;
        Integer end = numbers.length - 1;

        while (start < end) {

            Integer temp = numbers[start];

            numbers[start] = numbers[end];

            numbers[end] = temp;

            start++;
            end--;
        }
    }


    // Sort array
    public static void sortArray(Integer[] numbers) {

        Arrays.sort(numbers);
    }

}