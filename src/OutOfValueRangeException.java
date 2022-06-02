public class OutOfValueRangeException extends Exception{

    public OutOfValueRangeException(){
        super("Ergebnis liegt nicht im gültigen Bereich für Integer!");
    }
    public OutOfValueRangeException(String number){
        super(number + " liegt nicht im gültigen Bereich für Integer!");
    }
}
