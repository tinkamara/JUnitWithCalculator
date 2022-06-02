import java.util.Scanner;

public class Calculate {

    public static String calculate(String numberA, String numberB, String operator){
        Calculator calculator = new Calculator();
        int result;
        String resultString;
        try {
            result = calculator.calc(numberA, numberB, operator);

        } catch (Exception e) {
            resultString = e.getMessage();
            return resultString;
        }
        resultString = String.valueOf(result);
        return resultString;

    }

    public static void main(String[] args) {
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        while (!exit) {
            System.out.println("Erste Zahl:");
            String numberA = (scan.next());

            System.out.println("Operator:");
            String operator = scan.next();
            System.out.println("Zweite Zahl:");
            String numberB = scan.next();
            String resultString = Calculate.calculate(numberA, numberB, operator);

            System.out.println( resultString + "\n Weitermachen y/n?");
            if(scan.next().equals("n")){
                exit = true;
            }

        }
    }

}
