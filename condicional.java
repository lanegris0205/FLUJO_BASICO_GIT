import java.util.Scanner;

public class condicional {
   
   
    public static void main(String[] args) {
        // if simple
        Scanner leer = new Scanner (System. in);
        System.out.println("Ingrese edad ");
        int edad = leer.nextInt();
        if (edad>=18) {
            System.out.println("Eres mayor de edad ");   
        }
        
        // if-esle

        System.out.println("Ingrese nota ");
        int nota = leer.nextInt();
        if (nota>=70) {
            System.out.println("Aprobado ");   
        }
        else {
            System.out.println("reprobado ");
        }

    
        leer.close();

    }
}


