/**
 * Calculadora científica con operaciones matemáticas básicas y avanzadas.
 * Representa un objeto calculadora que debe ser instanciado para realizar los cálculos.
 * @author Francisco Pérez
 * @version 1.0
 */
public class CalculadoraCientifica {

    /**
     * Suma dos números.
     * @param a primer número (sumando)
     * @param b segundo número (sumando)
     * @return la suma de a y b
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números.
     * @param a primer número (minuendo)
     * @param b segundo número (sustraendo)
     * @return la resta de a menos b
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     * @param a primer número (multiplicando)
     * @param b segundo número (multiplicador)
     * @return el producto de a y b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números.
     * @param a el número a dividir (dividendo)
     * @param b el número por el cual dividir (divisor)
     * @return el cociente de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    /**
     * Calcula la potencia de un número.
     * @param base la base de la potencia
     * @param exponente el exponente de la potencia
     * @return el resultado de elevar la base al exponente
     * @see Math#pow(double, double)
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * @param a el número del cual se desea calcular la raíz (radicando)
     * @return la raíz cuadrada de a
     * @throws ArithmeticException si el número es negativo
     * @see Math#sqrt(double)
     */
    public double raizCuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo en los reales.");
        }
        return Math.sqrt(a);
    }

    /**
     * Punto de entrada principal para probar la calculadora.
     * Ejecuta una serie de pruebas automáticas en la consola.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        CalculadoraCientifica miCalc = new CalculadoraCientifica();

        System.out.println("=== Mi Programa: Calculadora Científica ===");
        System.out.println("1. Opción 1: Probar Suma (10 + 5)");
        System.out.println("2. Opción 2: Probar Raíz (64)");

        System.out.println("\n--- Ejecutando pruebas automáticas ---");

        System.out.println("Resultado Suma: " + miCalc.sumar(10, 5));
        System.out.println("Resultado Raíz: " + miCalc.raizCuadrada(64));
    }
}