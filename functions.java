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
}