import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperationsSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] numbers = {
                45, 12, -5, 90, 33,
                12, 0, 67, -20, 88,
                45, 100, 7, -3, 55
        };

        Integer searchNumber;
        Integer updateIndex;
        Integer updateValue;

        Integer sum;
        Double average;
        Integer highestNumber;
        Integer lowestNumber;

        IO.println("========== ARRAY INFORMATION ==========");
        IO.println("Total Elements: " + numbers.length);
        IO.println("First Element: " + numbers[0]);
        IO.println("Last Element: " + numbers[numbers.length - 1]);

        IO.println("\nArray Elements:");
        displayArrayWithIndexes(numbers);

        sum = calculateSum(numbers);
        average = calculateAverage(sum, numbers.length);
        highestNumber = findHighest(numbers);
        lowestNumber = findLowest(numbers);

        IO.println("\n========== ARRAY STATISTICS ==========");
        IO.println("Sum = " + sum);
        IO.println("Average = " + average);
        IO.println("Maximum = " + highestNumber);
        IO.println("Minimum = " + lowestNumber);

        IO.println("\n========== NUMBER CLASSIFICATION ==========");
        classifyNumbers(numbers);

        IO.print("\nEnter number to search: ");
        searchNumber = sc.nextInt();

        searchNumber(numbers, searchNumber);

        IO.print("\nEnter index to update: ");
        updateIndex = sc.nextInt();

        IO.print("Enter new value: ");
        updateValue = sc.nextInt();

        updateArray(numbers, updateIndex, updateValue);

        IO.println("\nUpdated Array:");
        displayArray(numbers);

        IO.println("\n========== REVERSE ARRAY ==========");
        displayReverse(numbers);

        IO.println("\n========== SORTED COPY ==========");
        Integer[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(sortedNumbers);

        displayArray(sortedNumbers);

        IO.println("Smallest value: " + sortedNumbers[0]);
        IO.println("Largest value: " + sortedNumbers[sortedNumbers.length - 1]);

        IO.println("\n========== ORIGINAL ARRAY ==========");
        displayArray(numbers);

        sc.close();
    }

    public static void displayArray(Integer[] numbers) {

        IO.print("[");

        for (Integer i = 0; i < numbers.length; i++) {

            IO.print(numbers[i]);

            if (i < numbers.length - 1) {
                IO.print(", ");
            }
        }

        IO.println("]");
    }

    public static void displayArrayWithIndexes(Integer[] numbers) {

        for (Integer i = 0; i < numbers.length; i++) {

            IO.println("Index " + i + " = " + numbers[i]);
        }
    }

    public static Integer calculateSum(Integer[] numbers) {

        Integer sum = 0;

        for (Integer number : numbers) {

            sum += number;
        }

        return sum;
    }

    public static Double calculateAverage(
            Integer sum,
            Integer size) {

        return sum.doubleValue() / size.doubleValue();
    }

    public static Integer findHighest(Integer[] numbers) {

        Integer highest = numbers[0];

        for (Integer number : numbers) {

            if (number > highest) {

                highest = number;
            }
        }

        return highest;
    }

    public static Integer findLowest(Integer[] numbers) {

        Integer lowest = numbers[0];

        for (Integer number : numbers) {

            if (number < lowest) {

                lowest = number;
            }
        }

        return lowest;
    }

    public static void classifyNumbers(Integer[] numbers) {

        Integer positive = 0;
        Integer negative = 0;
        Integer zero = 0;
        Integer even = 0;
        Integer odd = 0;

        for (Integer number : numbers) {

            if (number > 0) {

                positive++;

            } else if (number < 0) {

                negative++;

            } else {

                zero++;
            }

            if (number % 2 == 0) {

                even++;

            } else {

                odd++;
            }
        }

        IO.println("Positive Numbers: " + positive);
        IO.println("Negative Numbers: " + negative);
        IO.println("Zeros: " + zero);
        IO.println("Even Numbers: " + even);
        IO.println("Odd Numbers: " + odd);
    }

    public static void searchNumber(
            Integer[] numbers,
            Integer searchNumber) {

        Boolean found = false;
        Integer firstIndex = -1;
        Integer occurrences = 0;

        for (Integer i = 0; i < numbers.length; i++) {

            if (numbers[i].equals(searchNumber)) {

                if (!found) {

                    firstIndex = i;
                    found = true;
                }

                occurrences++;
            }
        }

        if (found) {

            IO.println("Number found.");
            IO.println("First index: " + firstIndex);
            IO.println("Occurrences: " + occurrences);

        } else {

            IO.println("Number not found.");
        }
    }

    public static void updateArray(
            Integer[] numbers,
            Integer index,
            Integer newValue) {

        if (index >= 0 && index < numbers.length) {

            numbers[index] = newValue;

            IO.println("Value updated successfully.");

        } else {

            IO.println("Invalid index.");
        }
    }

    public static void displayReverse(Integer[] numbers) {

        IO.print("[");

        for (Integer i = numbers.length - 1; i >= 0; i--) {

            IO.print(numbers[i]);

            if (i > 0) {

                IO.print(", ");
            }
        }
        IO.println("]");
    }
}