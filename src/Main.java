import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Введите число до которого выводить простые числа");
        int end = key.nextInt();


        for (int i = 1; i < end; i++) {
            if (i / i != 1 && i / 1 !=1) {
                continue;
            }

            System.out.println(i);
        }
        ;
    }
}
