import java.util.Scanner;

public class PreguntasParte1 {

    // Ejecuta 25 preguntas y devuelve los aciertos
    public static int ejecutar(Scanner scanner) {
        int aciertos = 0;
        String respuesta;

        System.out.println("\n--- BLOQUE 1: Preguntas 1 a 25 ---");

        // PREGUNTA 1
        System.out.println("\n1. Indica cual de las siguientes opciones no es un tipo primitivo en Java:");
        System.out.println("a. int \n b. char \n c. boolean \n d. String");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.nextLine().trim().toLowerCase();

        if (!respuesta.matches("[abcd]")) {
            System.out.println("Respuesta no válida: a, b, c, d");
            System.out.println("El programa ha terminado por entrada incorrecta.");
            System.exit(0);
        }
        if (respuesta.equals("dp")) {
            System.out.println("¡Respuesta correcta!");
            aciertos++;
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: d");
        }

        // PREGUNTA 2
        System.out.println("\n2. ¿Cuál es la extensión de los archivos de código fuente en Java?");
        System.out.println("a. .class \n b. .java \n c. .jar \n d. .txt");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.nextLine().trim().toLowerCase();

        if (!respuesta.matches("[abcd]")) {
            System.out.println("Respuesta no válida: a, b, c, d");
            System.out.println("El programa ha terminado por entrada incorrecta.");
            System.exit(0);
        }
        if (respuesta.equals("b")) {
            System.out.println("¡Respuesta correcta!");
            aciertos++;
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: b");
        }

        // PREGUNTA 3
        System.out.println("\n3. ¿Qué método es el punto de entrada principal para ejecutar un programa en Java?");
        System.out.println("a. start() \n b. init() \n c. main() \n d. run()");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.nextLine().trim().toLowerCase();

        if (!respuesta.matches("[abcd]")) {
            System.out.println("Respuesta no válida: a, b, c, d");
            System.out.println("El programa ha terminado por entrada incorrecta.");
            System.exit(0);
        }
        if (respuesta.equals("c")) {
            System.out.println("¡Respuesta correcta!");
            aciertos++;
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: c");
        }
