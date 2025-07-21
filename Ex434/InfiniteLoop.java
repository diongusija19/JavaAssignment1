public class InfiniteLoop {
    public static void main(String[] args) {
        int number = 2;

        while (true) { // Infinite loop
            System.out.println(number);
            number *= 2; // Multiply by 2
        }
    }
}