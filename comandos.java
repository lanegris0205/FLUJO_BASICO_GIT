public class comandos {
    public static void main(String[] args) throws Exception {
        //mostrar un mensaje o imprimir la informacion en consola
        System.out.println("hello, word!");

        // variables: almacena informacion de un tipo de dato como numerico, texto, decimal,etc

        // tipo numerico
        byte edad; //Rango de -128 hasta 127

        // representa un tipo de dato de 16 bits con signo, almacena entre:
        // numero corto
        short precio; //Rango de-32768 hasta 32767

        // numero entero
        int num_doc; //Rango de-2.147.483.648 a 2.147-483.648

        // numero largo    
        long valor; //Rango de -9.223.372.036.854.775-808 a 9.223.372.036.854.775.808

        // numero foltante o decimal
        float dolar; // Rango de 1.4x10-45 a 3.4028235x1038

        // numero doble 
        double valor_d; //Rango de 4.9x10-324 a 1.7976931348623157x10308 * /

        edad=40;
        precio=10000;
        num_doc=4567890;
        valor=1110234567;
        dolar=12.2f;
        valor_d=23.5;

        System.out.println(edad);
        System.out.println(precio);
        System.out.println(num_doc);
        System.out.println(valor);
        System.out.println(dolar);
        System.out.println(valor_d);
        System.out.println(edad);
        System.out.println(edad + precio + num_doc);
        

        // Incremento y decremento: son bucles o ciclos permiten hacer una tarea repetitiva hasta cumplir la condicion

        System.out.println("La edad actual es: "+ edad); //40
        // para sumarle se debe hacer
        edad++;
        System.out.println("La edad sumando 1 es: "+ edad);//41
        // para restarle
        edad--;
        System.out.println("La edad restando 1 es: "+ edad);//40
        // para aumentar x cantidad
        edad += 5;
        System.out.println("La edad aumentando 5 es: "+ edad);//45
        //para restar x cantidad
        edad -= 6;
        System.out.println("La edad restando 6 es: "+ edad);//39

        // Operaciones

        //sumar

        int suma = edad + 10;
        System.out.println("La suma es: "+ suma);//49
        System.out.println("La suma es: " +edad + 10);//39 + 10
        System.out.println( edad + 10 + " es la edad ");
        System.out.println( edad + 10 );
        System.out.println( " la edad es:  " +( edad + 10 ));

        // restar
        int resta = edad - 20;
        System.out.println("La edad restando 20 es: "+ resta);

        // multiplicacion

        int mult = edad * 5;
        System.out.println("La edad multiplicada por 5 es: "+ mult);

        // division

        float divi = edad / 2;
        System.out.println("La edad dividida en 2 es: "+ divi);

        // porcentaje

        int modu = edad % 2;
        System.out.println("El residuo de la edad dividida en 2 es: "+ modu);

        // variables y constantes

        int num = 5;
        final int num1 = 7;
        num += 3;
        System.out.println("El valor de num es: "+ num + num1);
        // num1 += 2;
      
        // clase math ( matematicas)

        // raiz cuadrada
        double raiz = Math.sqrt(16);
        System.out.println("la raiz cuadrada de 16 es: "+ raiz);

        // raiz cubica

        double raiz1 = Math.cbrt(27);
        System.out.println("la raiz cuadrada de 27 es: "+ raiz1);

        // exponente

        double elevado = Math.pow(3, 2);
        System.out.println(" 3 elevado al cuadrado es: "+ elevado);

        // redondear

        double redo = Math.round(12.5);
        System.out.println("12.5 sin decimal es: "+ redo);

    }
}
