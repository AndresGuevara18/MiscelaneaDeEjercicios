package co.edu.sena.miscelanea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ejercicios exercises = new Ejercicios();
        Scanner src = new Scanner(System.in);
        double number1=0, number2=0, number3=0;

        System.out.println("\nMISCELÁNEA DE EJERCICIOS JAVA.");
        System.out.println("*****************************\n");
        System.out.println("OPERADORES\n");
        System.out.println("\n1) CALCULAR EL ÁREA DE UN TRIÁNGULO.\n");
        System.out.println("Ingrese la base del triángulo");
        number1 = src.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        number2 = src.nextDouble();
        System.out.println("El área del triángulo es: "+exercises.CalculateAreaTriangle(number1,number2));

        System.out.println("\n///////////////////////////////////////////\n");
        System.out.println("2) INGRESAR DOS NÚMEROS POR LA CONSOLA Y SUMARLOS.");
        System.out.println("Ingresa el primer número:");
        number1 = src.nextDouble();
        System.out.println("Ingresa el segundo número:");
        number2 = src.nextDouble();
        System.out.println("La suma de los dos números es: "+exercises.AddTwoNumbers(number1,number2));
        System.out.println("\n**************************************\n");

        System.out.println("3) INGRESAR UN NÚMERO Y VISUALIZAR EL NÚMERO ELEVADO AL CUADRADO.");
        System.out.println("Ingresa el número:");
        number1 = src.nextDouble();
        System.out.println("El cuadrado del número "+number1+" es = "+exercises.SquareNumber(number1));
        System.out.println("\n**************************************\n");

        System.out.println("4) ESCRIBIR UN PROGRAMA QUE CONVIERTA DE EUROS A DÓLARES.");
        System.out.println("Ingresa el valor en Euros");
        number1 = src.nextDouble();
        System.out.println("El valor de "+number1+"€, A Dolares es: "+exercises.EurosToDollars(number1)+"$");
        System.out.println("\n**************************************\n");

        System.out.println("5) ESCRIBIR UN PROGRAMA QUE PIDA EL LADO DE UN CUADRADO Y CALCULE EL VALOR DEL ÁREA Y DEL PERÍMETRO.");
        System.out.println("Ingresa el lado del cuadrado:");
        number1 = src.nextDouble();
        System.out.println("El área del cuadrado es: "+exercises.SquareArea(number1));
        System.out.println("El perímetro del cuadrado es: "+exercises.SquarePerimeter(number1));
        System.out.println("\n**************************************\n");

        System.out.println("6) ESCRIBIR UN PROGRAMA QUE DETERMINE EL ÁREA Y EL VOLÚMEN DE UN CILINDRO.");
        System.out.println("Ingresa el radio de la base del cilindro (cm)");
        number1 = src.nextDouble();
        System.out.println("Ingresa la altura de la base del cilindro (cm)");
        number2 = src.nextDouble();
        System.out.println("El área del cilindro es: "+exercises.CylinderArea(number1,number2)+" cm².");
        System.out.println("El volumen del cilindro es: "+exercises.CylinderVolume(number1,number2)+" cm³.");
        System.out.println("\n**************************************\n");

        System.out.println("7) ESCRIBIR UN PROGRAMA QUE LEA EL RADIO DE UNA CIRCUNFERENCIA Y CALCULE LA LONGITUD " +
                " DE LA MISMA Y EL ÁREA DEL CÍRCULO INSCRITO.");
        System.out.println("Ingresa el radio de la circunferencia");
        number1 = src.nextDouble();
        System.out.println("La longitud de la circunferencia es: "+exercises.CircleLength(number1));
        System.out.println("El área de la circunferencia es: "+ exercises.AreaCircle(number1));
        System.out.println("\n**************************************\n");

        System.out.println("8. CALCULAR EL PROMEDIO DE TRES (3) NÚMEROS INGRESADOS POR TECLADO.");
        //ENTRADA
        System.out.println("Ingresa el primer número:");
        number1 = src.nextDouble();
        System.out.println("Ingresa el segundo número:");
        number2 = src.nextDouble();
        System.out.println("Ingresa el tercer número:");
        number3 = src.nextDouble();
        System.out.println("El promedio es: "+exercises.CalculateAverage(number1,number2,number3));

    }
}