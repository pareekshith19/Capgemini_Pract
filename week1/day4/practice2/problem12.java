public class problem12 {

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Random Numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (1000 + Math.random() * 9000); // Generate 4-digit random numbers
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double average = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            average += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        average /= numbers.length;
        return new double[] { average, min, max };
    }
}