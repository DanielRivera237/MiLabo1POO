import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;
        System.out.println("Ingresar primer numero:");
        num1 = scanner.nextDouble();
        System.out.println("Ingresar segundo numero");
        num2 = scanner.nextDouble();

        System.out.println("Ingresar 1 suma:");
        System.out.println("Ingresar 2 resta:");
        System.out.println("Ingresar 3 multiplicacion:");
        System.out.println("Ingresar 4 division:");

        operador = scanner.next().charAt(0);

        switch (operador){
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es:");
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es:");
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es:");
                break;
            case 4:
                if (num2 != 0){
                    resultado = num1 / num2;
                    System.out.println("El resultado de la divsion es:" + resultado);
                }else{
                    System.out.println("Error: no se púede dividir entre cero.");

                }
                break;
            default:
                System.out.println("operador no valido.");
        }
        scanner.close();
    }
}