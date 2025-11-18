public class Average {

    public static int greaterThan(int[] responseTimes) {
        int count = 0;
        double sum = responseTimes[0];

        for (int i = 1; i < responseTimes.length; i++) {
            double avg = sum / i;
            if (responseTimes[i] > avg) {
                count++;
            }
            sum += responseTimes[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(greaterThan(responseTimes));
    }
}
