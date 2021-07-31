import java.util.Scanner;

public class junio29c {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = calcular_digitos(numero);
        System.out.println(resultado);

    }
    public static int calcular_digitos(int numero){
        int cifras = 0;
        while(numero!=0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }
}

