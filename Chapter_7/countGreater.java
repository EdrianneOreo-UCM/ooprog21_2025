public class countGreater {

    public static int countGreater(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                sum += arr[i];
                continue;
            }

            double avg = (double) sum / i;

            if (arr[i] > avg) {
                count++;
            }

            sum += arr[i];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] responseTimes = {100, 200, 150, 300};

        System.out.println(countGreater(responseTimes));  
    }
}
