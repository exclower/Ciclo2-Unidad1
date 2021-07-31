import java.util.Scanner;

public class Junio29b {
    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Dame tu nombre: ");
        String nombre = scanner.nextLine();
        String nombre2 = scanner.nextLine();
        System.out.println("Hola "+ nombre + nombre2);
        System.out.println(ejer1_saludo(nombre2));
    }
    public static String ejer1_saludo(String nombre){
        return "Hola " + nombre;
    }
}
