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
        String oper = input.replaceAll("\\w|\\d", "");
        System.out.println("Оператор - " + oper);
        String[] comand = input.split("[+-/*]", 2);
        System.out.println("Первое число - " + comand[0]);
        System.out.println("Второе число - " + comand[1]);
        // Проверяем какие числа нам передали если это арабские то будет больше 0 если римкие то будет 0
        int chek = Integer.parseInt(comand[0].replaceAll("[A-Za-zА-Яа-я]", "0"));
        System.out.println("Проверка  " + chek);
        int result = 0;
        if (chek <= 0) {
            System.out.println("Расчёт в римских");
            int numrom1 = roman(comand[0]);
            int numrom2 = roman(comand[1]);
            System.out.println("Проверка римских цифр" + numrom1 + numrom2);
            switch (oper) {
                case "+":
                    result = numrom1 + numrom2;
                    System.out.println("Проверка калькулятора  " + result);
                    break;
                case "-":
                    result = numrom1 - numrom2;
                    System.out.println("Проверка калькулятора  " + result);
                    break;
                case "*":
                    result = numrom1 * numrom2;
                    System.out.println("Проверка калькулятора  " + result);
                    break;
                case "/":
                    result = numrom1 / numrom2;
                    System.out.println("Проверка калькулятора  " + result);
                    break;
                default:
                    System.out.println(" ");
            }
            System.out.println("Расчёт произведен : " + result+roman[result]);
        } else {
            System.out.println("Расчёт в арабских");
            int num1 = Integer.parseInt(comand[0]);
            int num2 = Integer.parseInt(comand[1]);
            switch (oper) {
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
        }

        ///   int ifnum2= Integer.parseInt(comand[1].replaceAll("\"[A-Za-zА-Яа-я0-9]\"", "0"));
//        String operator = comand[1];
        //       System.out.println(ifnum1);
//        System.out.println(ifnum2);
//        System.out.println(comand[1]);
        //       if (ifnum1 > 0 && ifnum2 > 0){
        //           System.out.println("Расчёт должен быть в арабских");
        //     }else {
        //       System.out.println("Расчёт должен быть в римских");
        //    }
        //  String [] arab = {"0","1","2","3","4","5","6","7","8","9","10"};
        //   String [] rome ={"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        //  int romenum = Arrays.asList(rome).indexOf("III");
        //  System.out.println(" Римская "   + arab[romenum]);
        return input;
    }

    static String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    public static int roman(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        }
        return -1;
    }
}
//    public static int calcul(int num1, int num2, String operator) {
//        switch (operator) {
//            case "+":
//                result = num1 + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                result = num1 / num2;
//                break;
//            default:
//                System.out.println("Операция не распознана. Повторите ввод.");
//        }
//        System.out.println("Расчёт произведен : " + result);
//        return num1;
//    }


