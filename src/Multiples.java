public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 3; i <= 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // add to counter
            if ((divisibleBy3) || (divisibleBy5)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
