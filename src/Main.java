import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        float result = 0;
        float operand1 = sc.nextFloat();
        int choice = 0;
        while (choice != 2) {
            System.out.println("Введите одну из операций ( + , - , * , / ):");
            char operation = sc.next().charAt(0);
            System.out.println("Введите второе число:");
            float operand2 = sc.nextFloat();
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    while (operand2 == 0) {
                        System.out.println("На 0 делить нельзя! \nВведите другое число");
                        operand2 = sc.nextFloat();
                    }
                    result = operand1 / operand2;
                    break;
                case 'c':
                    System.out.println("Программа завершена");
                    break;
                default:
                    System.out.println("некорректная операция");
            }
            System.out.println("Результат: " + result);
            operand1 = result;
            System.out.println("Желаете продолжить? (1. Да / 2. Нет)");
            choice = sc.nextInt();
        }
        System.out.println("Программа завершена");
        System.out.println("Удачи!");
    }
}