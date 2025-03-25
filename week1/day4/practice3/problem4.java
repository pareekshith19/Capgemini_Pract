import java.util.Arrays;

public class problem4 {

    public static int countDigits(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number, int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        System.out.println("Is Palindrome: " + isPalindrome(number, digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("Array 1 and Array 2 are equal :"+ areArraysEqual(arr1,arr2));
        System.out.println("Array 1 and Array 3 are equal :"+ areArraysEqual(arr1,arr3));
    }
}