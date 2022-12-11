import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int result;

    public static void main(String[] args) {
        System.out.println("Введите команду ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        System.out.println("Вы ввели - " + command);
        Main.calc(command);
    }

    public static String calc(String input) {
        String oper = input.replaceAll("\\w|\\d", "");
        System.out.println("Оператор - "+oper);
        String[] comand = input.split("[+-/*]", 2);
        System.out.println("Первое число - "+comand[0]);
        System.out.println("Второе число - "+comand[1]);
      // Проверяем какие числа нам передали если это арабские то будет больше 0 если римкие то будет 0
        int chek = Integer.parseInt(comand[0].replaceAll("[A-Za-zА-Яа-я]", "0"));
        System.out.println("Проверка  "+chek);
        if(chek<=0){
            System.out.println("Расчёт в римских");
        }else {
            System.out.println("Расчёт в арабских");
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

    public static int calcul(int num1, int num2, String operator) {
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
        return num1;
    }
}

