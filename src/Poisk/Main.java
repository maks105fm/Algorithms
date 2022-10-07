package Poisk;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {2, 2, 3, 4, 5, 6, 78, 1, 4, 3, 2, 5, 7, 44};
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }

        }
        System.out.println(min);

    }
}
