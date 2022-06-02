public class Calculator {
     int result;

     public Calculator(){

     }

     public int calc(String numberA, String numberB, String operator) throws NotAnOperatorException, DivideByZeroException, OutOfValueRangeException{
         return switch (operator) {
             case "+" -> add(numberA, numberB);
             case "+e" ->addExact(numberA,numberB);
             case "-" -> sub(numberA, numberB);
             case "*" -> mult(numberA, numberB);
             case "/" -> div(numberA, numberB);
             case "%" -> mod(numberA, numberB);
             default -> throw new NotAnOperatorException(operator);
         };
     }
    public int castToInt(String number) throws OutOfValueRangeException {
        int i;
        try {
            i = Integer.parseInt(number);
        } catch (Exception e) {
            throw new OutOfValueRangeException(number);
        }
        return i;
    }

     public int add(String numberA, String numberB) throws OutOfValueRangeException{
         int a = castToInt(numberA);
         int b = castToInt(numberB);
         result = a + b;
         return result;
     }
    public int addExact(String numberA, String numberB) throws OutOfValueRangeException{
        int a = castToInt(numberA);
        int b = castToInt(numberB);
        try {
            result = Math.addExact(a, b);
        }catch (ArithmeticException e){
            throw new OutOfValueRangeException();
        }
        return result;
    }
    public int sub(String numberA, String numberB) throws OutOfValueRangeException{
        int a = castToInt(numberA);
        int b = castToInt(numberB);
        try {
            result = Math.subtractExact(a, b);
        }catch (ArithmeticException e){
            throw new OutOfValueRangeException();
        }

        return result;
    }
    public int mult(String numberA, String numberB) throws OutOfValueRangeException{
        int a = castToInt(numberA);
        int b = castToInt(numberB);
        result = a * b;
        if(result / a != b | result / b != a){
            throw new OutOfValueRangeException();
        }
        return result;
    }
    public int div(String numberA, String numberB) throws OutOfValueRangeException, DivideByZeroException{
        int a = castToInt(numberA);
        int b = castToInt(numberB);
        if(b==0){
            throw new DivideByZeroException();
        }
        result = a / b;
        return result;
    }
    public int mod(String numberA, String numberB) throws OutOfValueRangeException, DivideByZeroException{
        int a = castToInt(numberA);
        int b = castToInt(numberB);
         if(b==0){
             throw new DivideByZeroException();
         }
        result = a % b;
        return result;
    }

}
