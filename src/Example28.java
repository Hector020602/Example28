import java.util.Scanner;
    public class Example28 {
        public static void main(String[] argv) {

            Scanner inputValue;
            inputValue = new Scanner(System.in);

            int n1, n2;
            int addition = 0;

            System.out.println("Enter 2 numbers");
            n1 = inputValue.nextInt();
            n2 = inputValue.nextInt();

            for(int i = 1; i <= n2; i++) {
                addition = addition + n1;
            }

            System.out.println(addition);

        }
}
