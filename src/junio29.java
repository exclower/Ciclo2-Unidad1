import java.util.Scanner;

public class junio29 {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); //Objeto Scanner y el System.in es el PARAMETRO DE ENTRADA PARA RECIBIR INFOR, viene del terminal
        String ingreso = scanner.nextLine();
        System.out.println(ingreso+ "coño");

        //Condicionales
        /*if(5>8){
            System.out.println("Hola");
        }else if (4>1){
            System.out.println(":D");
        }else{
            System.out.println("Adios");
        }*/

        //SWITCHES:Condicionales tipados
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el nombre de un animal");
        String animal = scanner.nextLine();
        switch(animal){
            case "Perro":
                System.out.println("Woff");
                break;
            case "Gato":
                System.out.println("Miaou");
                break;
            default:
                System.out.println(":)");
        }
        int contador=0;
        while(contador<5){
            System.out.println(":)");
            contador +=1;
        }
        for(int i=0;i<=8;i+=2){
            System.out.println(i);
        }
        int numero = 10;
        do{
            System.out.println("Hey");
            numero--;
        }while(numero>8);

        //Do while para que el usuario ingrese algo
        String valor = "";
        do{
            //Scanner scanner = new Scanner(System.in);
            valor = scanner.nextLine();
        }while(valor.equals(""));
    }
    
}
