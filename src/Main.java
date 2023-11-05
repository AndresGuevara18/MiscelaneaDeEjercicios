import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valorPi = 3.1415;

        System.out.println("\n1) CALCULAR EL ÁREA DE UN TRIÁNGULO.\n");
        //ENTRADA
        System.out.println("Ingresa la base del triángulo");
        double base = entrada.nextFloat();
        System.out.println("Ingresa la altura del triángulo");
        double altura = entrada.nextFloat();
        //PROCESO
        double area = (base * altura)/2;
        //SALIDA
        System.out.println("El área del triángulo es: "+area +"<---");

        System.out.println("\n///////////////////////////////////////////\n");
        //ENTRADA
        System.out.println("2) INGRESAR DOS NÚMEROS POR LA CONSOLA Y SUMARLOS.");
        System.out.println("Ingresa el primer número:");
        double number1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo número:");
        double number2 = entrada.nextDouble();
        //PROCESO
        double suma = number1 + number2;
        //SALIDA
        System.out.println("La suma de los dos números es: "+suma+" <----");

        System.out.println("\n**************************************\n");

        System.out.println("3) INGRESAR UN NÚMERO Y VISUALIZAR EL NÚMERO ELEVADO AL CUADRADO.");
        //ENTRADA
        System.out.println("Ingresa el número");
        double numCuadra = entrada.nextDouble();
        //PROCESO
        double cuadrado = numCuadra * numCuadra;
        //SALIDA
        System.out.println("El cuadrado del número "+numCuadra+" es = "+cuadrado);

        System.out.println("\n**************************************\n");

        System.out.println("4) ESCRIBIR UN PROGRAMA QUE CONVIERTA DE EUROS A DÓLARES.");
        //ENTRADA
        System.out.println("Ingresa el valor en Euros");
        double euros = entrada.nextDouble();
        double dolarUni = 1.06;
        //PROCESO
        double cambio = euros*dolarUni;
        //SALIDA
        System.out.println("El valor de "+euros+"€, A Dolares es: "+cambio+"$");

        System.out.println("\n**************************************\n");

        System.out.println("5) ESCRIBIR UN PROGRAMA QUE PIDA EL LADO DE UN CUADRADO Y CALCULE EL VALOR DEL ÁREA Y DEL PERÍMETRO.");
        //ENTRADA
        System.out.println("Ingresa el lado del cuadrado:");
        double lado = entrada.nextDouble();
        double areaCuadrado = lado*lado;
        //PROCESO
        double perimetro = lado*4;
        //SALIDA
        System.out.println("El área del cuadrado es: "+areaCuadrado);
        System.out.println("El perímetro del cuadrado es: "+perimetro);

        System.out.println("\n**************************************\n");

        System.out.println("6) ESCRIBIR UN PROGRAMA QUE DETERMINE EL ÁREA Y EL VOLÚMEN DE UN CILINDRO.");
        //ENTRADA
        System.out.println("Ingresa el radio de la base del cilindro (cm)");
        double baseCilindro = entrada.nextDouble();
        System.out.println("Ingresa el altura de la base del cilindro (cm)");
        double alturaCilindro = entrada.nextDouble();
        //PROCESO
        double areaCilindro = 2 * valorPi * baseCilindro * (baseCilindro + alturaCilindro);
        double volumenCilindro = valorPi * (baseCilindro * baseCilindro) * alturaCilindro;
        //SALIDA
        System.out.println("El área del cilindro es: "+areaCilindro+" cm².");
        System.out.println("El volumen del cilindro es: "+volumenCilindro+" cm³.");

        System.out.println("\n**************************************\n");

        System.out.println("7) ESCRIBIR UN PROGRAMA QUE LEA EL RADIO DE UNA CIRCUNFERENCIA Y CALCULE LA LONGITUD " +
                " DE LA MISMA Y EL ÁREA DEL CÍRCULO INSCRITO.");
        //ENTRADA
        System.out.println("Ingresa el radio de la circunferencia");
        double circuloRadio = entrada.nextDouble();
        //PROCESO
        double circuloLongitud = 2 * valorPi * circuloRadio;
        double circuloArea = valorPi * (circuloRadio * circuloRadio);
        //SALIDA
        System.out.println("La longitud de la circunferencia es: "+circuloLongitud);
        System.out.println("El área de la circunferencia es: "+ circuloArea);

        System.out.println("\n**************************************\n");

        System.out.println("8. CALCULAR EL PROMEDIO DE TRES (3) NÚMEROS INGRESADOS POR TECLADO.");
        //ENTRADA
        System.out.println("Ingresa el primer número:");
        double numberOne = entrada.nextDouble();
        System.out.println("Ingresa el segundo número:");
        double numberTwo = entrada.nextDouble();
        System.out.println("Ingresa el tercer número:");
        double numberThree = entrada.nextDouble();
        //PROCESO
        double promedio = (numberOne + numberTwo + numberThree) / 3;
        //SALIDA
        System.out.println("El promedio es: "+promedio);


    }
}