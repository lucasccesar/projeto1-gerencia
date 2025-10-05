public class Divisao {
    public static int dividir(int a, int b) {
        if(b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / b;
    }
}

