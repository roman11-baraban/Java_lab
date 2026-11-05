import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите задание: ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.println("Введите первое число:");
                double num1 = scanner.nextDouble();

                System.out.println("Введите второе число:");
                double num2 = scanner.nextDouble();

                double sum = num1 + num2;

                System.out.println(sum);
                break;

            case 2:
                System.out.println("Введите число:");
                double num = scanner.nextDouble();

                if (num < 0) {
                    num = -num;
                }

                System.out.println("Модуль числа: " + num);
                break;

            case 3:
                // for (int i = 200; i <= 100; i += 2) {
                //    System.out.println(i);
               // }
                int i = 220;
                do{
                    i+=2;
                    System.out.println(i + " ");
                }while(i<=100);
                break;

            default:
                System.out.print("Выбрано неверное задание");
        }
    }
}