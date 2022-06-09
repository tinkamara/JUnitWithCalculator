package ExampleForCodeCoverageStatement;

public class PrintSum {

    private int a;
    private int b;

    /*
    Konstruktor
     */
    public PrintSum(int a, int b){
        this.a =a;
        this.b = b;
    }
    /*
    Methoden
     */

    // Zahlen werden addiert
    public String printTheSum(){
        int result = a+b;                                   //addierte Zahlen werden zwischengespeichert
        if(result > 0){                                     //Prüfen ob result > 0
            System.out.println("Positive " + result);
            return "positive";                              //wenn ja Positiv
        }

        else if (result == 0) {                             // result = 0 ?
            System.out.println("The result is neither positive nor negative" + result);
            return "The result is neither positive nor negative"; // Rückgabe weder Positiv noch negativ
        }

        else{
            System.out.println("Negative " + result);
            return "negative";
        }
    }



    /*
    Getter and Setter
     */
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
