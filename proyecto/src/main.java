public class main { 

    public static void main(String[] args){
        saludoBucle();
        despedida();
    }


    /*
    Muestra hola mundo 5 veces
    de una manera bastatnte ineficiente.    
    */

    public static void main saludoBucle(){
        int i =0;

        while(i<5){
           System.out.println("Hola mundo"); 
           i++;
        }

    }

    /*
    Muestra un mensaje que infica el
    final de la ejecución del programa.
     */

    private static void despedida() { System.out.println("\n Fin del programa.")}

}