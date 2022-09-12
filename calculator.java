import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("===Calculator===");
        Scanner scanner = new Scanner(System.in);
        int active = 1;
        do {
            System.out.println("Выберите действие: 1(+), 2(-), 3(:), 4(x), 0(exit)");
            int mathAction = scanner.nextInt();
            System.out.print("Введите первое слагаемое: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Введите второе слагаегоме: ");
            int secondNumber = scanner.nextInt();
            switch (mathAction)
                {
                case 1:
                {
                    int ansNumber = firstNumber + secondNumber;
                    System.out.println("Ответ равен:" + ansNumber + "\n");
                    break;
                }
                case 2:
                {
                    int ansNumber = firstNumber - secondNumber;
                    System.out.println("Ответ равен:" + ansNumber + "\n");
                    break;
                }
                case 3:
                {
                    int ansNumber = firstNumber / secondNumber;
                    System.out.println("Ответ равен:" + ansNumber + "\n");
                    break;
                }
                case 4:
                {
                    int ansNumber = firstNumber * secondNumber;
                    System.out.println("Ответ равен:" + ansNumber + "\n");
                    break;
                }
                case 0:
                {
                    System.out.println("BB");
                    active --;
                    break;
                }
                case 228:
                {
                    System.out.println("И?");
                }
                default:
                {
                    System.out.println("ТЫ ЧИТАТЬ НЕ УМЕЕШЬ? НАДО ЧИСЛА ОТ 0 ДО 4 А НЕ ТВОЁ 74853795347530247023 И FOGHOIRGEG");
                }
            }
        }
        while (active == 1) ;
        }
    }