package respostaTeste;

public class FibonacciTest {
    // Método para verificar se um número é um número de Fibonacci
    public boolean isFibonacci(int number) {
        int a = 0, b = 1;

        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == number;
    }
}