public class function {

    public int factorial(int n) {
        int fact = 1;

        if (n < 0) {
            return -1;//inesistencia de factorian negativo
        } else if (n == 0) {
            return 1;// fact 0 e 1
        } else {
            for (int i = n; i >= 1; i--) {
                fact *= i;
            }
        }
        return fact;
    }

    public void recurcividade() {

    }
    
    public static double raiz(int valor, int index_raiz) {// o primeiro valor = radicando, e o segundo = index da raiz 

        //A raiz e o "oposto" da potencia:
        return Math.pow(valor, (1.0 / index_raiz));// retornando a raiz de index desconhecido

        /* ou poderia ser
           return Math.sqrt(valor); // retorna a raiz quadrada 
           return Math.cbrt(valor); // retorna a raiz cubica
         */
    }
}