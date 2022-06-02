public class NotAnOperatorException extends Exception{

    public NotAnOperatorException(String notAnOperator){
        super(notAnOperator + " ist keine gültige Rechenoperation!");
    }
}
