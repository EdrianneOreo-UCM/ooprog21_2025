public class ArraysDemo {

    public static void main(String[] args) {

        int[] arr = new int[5];

        s
        display("Original array:", arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 8;
        }
        display("After filling with 8s:", arr);

        arr[1] = 3;
        arr[4] = 3;
        display("After changing two values:", arr);

        java.util.Arrays.sort(arr);
        display("After sorting:", arr);
    }

    public static void display(String message, int[] array) {
        System.out.print(message + "   ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
