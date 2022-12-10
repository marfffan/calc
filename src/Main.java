import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите команду ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        System.out.println("Вы ввели - " + command);
        Main.calc(command);
    }

    public static String calc(String input) {
        String[] comand = input.split("", 3);
        int num1 = Integer.parseInt(comand[0]);
        int num2 = Integer.parseInt(comand[2]);
        String operator = comand[1];
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(comand[1]);
        int result = 0;
        String [] arab = {"0","1","2","3","4","5","6","7","8","9","10"};
        String [] rome ={"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        int romenum = Arrays.asList(rome).indexOf("III");
        System.out.println(" Римская "   + arab[romenum]);
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        System.out.println("Расчёт произведен : " + result);
        return input;
    }
}

