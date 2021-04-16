public class Second {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9, 10, 15};

        int temp = 0;
        int secondTemp = 0;

        int indexes = 0;
        temp = numbers[0];

        for (int j = 1; j <= numbers.length - 1; j++) {
            int temp2 = numbers[j];
            if (temp < temp2) {
                temp = temp2;
                indexes = j;
            }
        }
        System.out.println(temp + " This is the max one");
        numbers[indexes] = 0;

        for (int j = 1; j <= numbers.length - 1; j++) {
            int temp2 = numbers[j];
            if (secondTemp < temp2) {
                secondTemp = temp2;
            }
        }
        System.out.println(secondTemp + " This is the second  max one");
    }
}
