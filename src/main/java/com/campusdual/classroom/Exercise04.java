package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obten el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número 7 → (7!): " + factorial(7));
        System.out.println("Obtén el factorial del número 7 → (7!) de forma recursiva: " + recursiveFactorial(7));

    }
    //E metodo calculará la suma de los primeros números enteros que se solicite en el parámetro
    public static int sumNum(int num) {
       int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    // Recibe un número entero por parámetro. El metodo calculará la suma de los primeros números enteros pares que se solicite en el parámetro
    public static int sumEvenNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
                sum = sum + (i*2);
            }

        return sum;
    }
    // Recibe un número entero por parámetro. El metodo calculará el factorial del número que se le pase como parámetro
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    // Recibe un número entero por parámetro. El metodo calculará el factorial del número que se le pase como parámetro de forma recursiva
    public static int recursiveFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
