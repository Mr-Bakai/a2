import java.util.Scanner;

public class Third {

    static int[] numbers;
    static int startPoint;
    static int endPoint;

    public static void main(String[] args) {
        input();
    }

    private static void input() {

        System.out.println("Please enter initial point : ");
        Scanner sc = new Scanner(System.in);
        startPoint = sc.nextInt();

        System.out.println("Please enter ending point: ");
        endPoint = sc.nextInt();

        if (startPoint > 0 && endPoint > 0) {
            calcPrimeNumbers();
        } else {
            System.out.println("numbers cannot be negative");
            input();
        }
    }

    private static void calcPrimeNumbers() {
        numbers = new int[endPoint - startPoint + 1];
        System.out.printf("Prime numbers between %d and %d are: ", startPoint, endPoint);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = startPoint;
            startPoint++;
        }
        for (int num : numbers) {
            int x = 0;
            if (num >= 2) {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        x = 1;
                        break;
                    }
                }
                if (x == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}