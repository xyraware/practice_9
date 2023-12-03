import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Шаг 1.Измените код в листинге 18.3 на следующий:\n" +
                "public class Exception2 {\n" +
                "public void exceptionDemo() {\n" +
                "Scanner myScanner = new Scanner( System.in);\n" +
                "System.out.print( \"Enter an integer \");\n" +
                "String intString = myScanner.next();\n" +
                "int i = Integer.parseInt(intString);\n" +
                "System.out.println( 2/i );\n" +
                " }\n" +
                "}\n" +
                "Шаг 2. Запустите эту программу со следующими выводами: Qwerty\n" +
                "0 1.2 1. Посмотрите на вывод.\n" +
                "Объясните какие исключения выбрасываются?\n" +
                "Шаг 3. Измените код, добавив блоки try – catch, чтобы иметь дело с\n" +
                "определяемыми исключениями.\n" +
                "Объясните поведение программы\n" +
                "Если требуется перейти к следующему заданию, то напишите exit");
        task2();
        System.out.println("Задание № 4\n" +
                "Шаг 1. Добавьте блок finally к решению Задания №2.\n" +
                "Шаг 2. Повторно запустите программу, чтобы проверить ее\n" +
                "поведение. Объясните новое поведение программы\n");
        task4();
    }

    public static void task2() {
        System.out.println("Выполнение задание 1");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer ");
            String input = sc.next();
            int intInputValue = 0;
            try {
                intInputValue = Integer.parseInt(input);

                try {
                    System.out.println(2 / intInputValue);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Attempted division by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Attempted to write non-numbers to integer");
            }
        }
    }

    public static void task4() {
        System.out.println("Выполнение задание 4");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer ");
            String input = sc.next();
            int intInputValue = 0;
            try {
                int i = Integer.parseInt(input);
                System.out.println(2 / i);
                break;
            } catch(ArithmeticException e){
                    System.out.println("Attempted division by zero");
                } catch(NumberFormatException e){
                    System.out.println("Attempted to write non-numbers to integer");
                }finally {
                System.out.println("Окончание выполнения 4 задания");
            }
        }
    }
}
