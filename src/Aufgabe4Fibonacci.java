public class Aufgabe4Fibonacci {
    public static void main(String[] args){

        System.out.println(fibonacciRecursive(8));
        System.out.println(fibonacciIterative(8));
    }
                                            // Bei der rekursiven Variante verzweigen sich die Methodenaufrufe
                                            // nach jedem Durchlauf in weitere Knoten,
                                            // welche hingegen weitere Knoten erzeugen.
                                            // Diese Variante ist performance-lastig.
    private static int fibonacciRecursive(int i){
        if(i <= 0){
            return 0;
        } else if (i == 1){
            return 1;
        } else {
            return fibonacciRecursive(i - 2) + fibonacciRecursive(i - 1);
        }
    }
                                     // Bei der iterativen Methode wird bis zur
                                     // n-ten Fib-Zahl benachbarte Zahlen addiert.
                                                                                    // Dabei merkt sich die folgende Methode jeweils
                                                                                    // die vorherige Zahl, um sie im Anschluss wieder aufzuaddieren.
    private static int fibonacciIterative(int nFib){
        if (nFib <= 1){
            return nFib;
        }
        int aktFib = 1;
        int last = 1;

        for (int i=2; i<nFib; i++){
            int buffer = aktFib;
            aktFib += last;
            last = buffer;
        }
        return aktFib;
    }
}
