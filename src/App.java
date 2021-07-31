public class App {
    //comentario simple
    /*COM
    enta
    rio
    */
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //enteros
        byte entero8bits = 127;
        short entero16bits = 32767;
        int numero32bits = 2147483647;
        long entero64bits = 534;
        //Decimales
        float numero2 = 1.222222222222222f;
        double numero3 = 1.3333333333333333;
        //String
        String nombre = "Joshua";
        //Booleanas
        boolean variable = true;

        //Listas arreglos
        int [] lista = {1,5,8,6,7};

        //Variables genericas sin tipador
        var Variable = "hola";
        System.out.println(lista[2]);       
        System.out.println("Hooola Mundoo");
        System.out.println(numero32bits);
        System.out.println(numero2);
        System.out.println(numero3);

    }
}
