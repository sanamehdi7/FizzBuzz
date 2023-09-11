public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int counter = 0;

        if (n == 0) {
            System.out.println(counter);
        } else if (n % 2 == 0) {
            n = n / 2;
            counter++;
        } else {
            n--;
            counter++;
        }


    }
}
