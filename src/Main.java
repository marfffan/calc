import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите команду ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Main.calc(command);
    }

    public static String calc(String input) {
        String oper = input.replaceAll("\\w|\\d", "");
        String[] comand = input.split("[+-/*]", 2);
        // Проверяем какие числа нам передали если это арабские то будет больше 0 если римкие то будет 0
        int chek = Integer.parseInt(comand[0].replaceAll("[A-Za-zА-Яа-я]", "0"));
        int result = 0;
        if (chek <= 0) {
            int numrom1 = roman(comand[0]);
            int numrom2 = roman(comand[1]);
            switch (oper) {
                case "+":
                    result = numrom1 + numrom2;
                    break;
                case "-":
                    result = numrom1 - numrom2;
                    break;
                case "*":
                    result = numrom1 * numrom2;
                    break;
                case "/":
                    result = numrom1 / numrom2;
                    break;
                default:
                    System.out.println(" ");
            }
            System.out.println(comand[0]+oper+comand[1]+"=" +roman[result]);
        } else {
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
                    System.out.println("");
            }
            System.out.println(num1+oper+num2+"= " + result);
        }
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

