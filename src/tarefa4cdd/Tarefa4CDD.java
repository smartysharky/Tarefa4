package tarefa4cdd;
import java.util.Scanner;

/**
 *
 * @author Ana Pallarés Rodríguez
 */
public class Tarefa4CDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE SUMAS Y RESTAS");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("");
        int awns = scan.nextInt();
        scan.nextLine();
        
        System.out.println("");
        System.out.println("Introduzcal el primer número: ");
        double a = scan.nextDouble();
        System.out.println("Introduzca el segundo número: ");
        double b = scan.nextDouble();
        
        double result;
        
        switch (awns) {
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
            default:
                throw new AssertionError();
        }
        
        System.out.println("El resultado de la operación es: " + result);
        
    }
    
}
