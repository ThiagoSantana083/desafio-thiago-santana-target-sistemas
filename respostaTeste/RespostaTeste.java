package respostaTeste;

import respostaTeste.ReverseStringExample;

public class RespostaTeste {
    public static void main(String[] args) {
        // 1 questão fazer uma soma - O resultado vai ser 91;

        int indice = 13, soma = 0, k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println(soma);

        // 2 questão de fazer verificação de número fibonacci

        FibonacciTest fibonacciTest = new FibonacciTest();

        int numero = 13; // Número que você deseja verificar
        if (fibonacciTest.isFibonacci(numero)) {
            System.out.println(numero + " é um número de Fibonacci.");
        } else {
            System.out.println(numero + " não é um número de Fibonacci.");
        }

        // Questão 3 - inverter string;

        ReverseStringExample stringExample = new ReverseStringExample();

        String str = "Exemplo de reversão";
        System.out.println(stringExample.reverseString(str));
    }



}
