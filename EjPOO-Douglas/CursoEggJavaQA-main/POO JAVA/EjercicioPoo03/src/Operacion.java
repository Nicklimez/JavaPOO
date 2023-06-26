public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        int suma = operacion.sumar();
        System.out.println("Suma: " + suma);
        int resta = operacion.restar();
        System.out.println("Resta: " + resta);

        int multiplicacion = operacion.multiplicar();
        if (multiplicacion != 0) {
            System.out.println("Multiplicacion: " + multiplicacion);
        }

        int division = operacion.dividir();
        if (division != 0) {
            System.out.println("Division: " + division);
        }
    }
}



///
import java.util.Scanner;

public class Operacion {
    Scanner tecla = new Scanner(System.in);
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {

    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        System.out.print("Ingresar el primer numero: ");
        num1 = tecla.nextInt();
        System.out.print("Ingresar el segundo numero: ");
        num2 = tecla.nextInt();
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede multiplicar por cero!");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public int dividir() {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero!");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}