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

        // PREGUNTA 4
        System.out.println("\n4. ¿Cuál de los siguientes operadores se utiliza para comparar la igualdad de dos valores primitivos?");
        System.out.println("a. = \n b. == \n c. equals() \n d. ===");
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

        // PREGUNTA 5
        System.out.println("\n5. ¿Qué estructura de control se utiliza para realizar selecciones múltiples basadas en el valor de una variable?");
        System.out.println("a. if-else \n b. switch \n c. while \n d. for");
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

        // PREGUNTA 6
        System.out.println("\n6. ¿Cuál de los siguientes tipos de datos ocupa más memoria en bytes?");
        System.out.println("a. int \n b. byte \n c. long \n d. short");
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

        // PREGUNTA 7
        System.out.println("\n7. ¿Cómo se denota un comentario de una sola línea en Java?");
        System.out.println("a. <!-- comentario --> \n b. /* comentario */ \n c. // comentario \n d. # comentario");
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

        // PREGUNTA 8
        System.out.println("\n8. ¿Cuál es el resultado de la expresión 10 % 3 en Java?");
        System.out.println("a. 3 \n b. 1 \n c. 0 \n d. 3.33");
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

        // PREGUNTA 9
        System.out.println("\n9. ¿Qué bucle garantiza que su bloque de código se ejecute al menos una vez?");
        System.out.println("a. for \n b. while \n c. do-while \n d. foreach");
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

        // PREGUNTA 10
        System.out.println("\n10. ¿Qué palabra clave se utiliza para declarar una constante en Java?");
        System.out.println("a. constant \n b. readonly \n c. final \n d. static");
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

        // PREGUNTA 11
        System.out.println("\n11. ¿Cuál es el índice inicial por defecto para los arrays en Java?");
        System.out.println("a. 1 \n b. 0 \n c. -1 \n d. Depende del tamaño");
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

        // PREGUNTA 12
        System.out.println("\n12. ¿Qué clase de Java se utiliza habitualmente para leer datos desde la consola?");
        System.out.println("a. ConsoleReader \n b. InputScan \n c. Scanner \n d. ReadLine");
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

        // PREGUNTA 13
        System.out.println("\n13. ¿Cuál de los siguientes operadores lógicos representa el operador 'Y' (AND) lógico?");
        System.out.println("a. || \n b. && \n c. ! \n d. &^");
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

        // PREGUNTA 14
        System.out.println("\n14. ¿Qué paquete se debe importar para utilizar la clase Scanner?");
        System.out.println("a. java.io.* \n b. java.util.* \n c. java.net.* \n d. java.text.*");
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

        // PREGUNTA 15
        System.out.println("\n15. ¿Cómo se llama el proceso mediante el cual Java convierte automáticamente un tipo primitivo en su clase Wrapper equivalente?");
        System.out.println("a. Casting \n b. Parsing \n c. Autoboxing \n d. Wrapping");
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

        // PREGUNTA 16
        System.out.println("\n16. ¿Qué instrucción se utiliza para salir de un bucle o una estructura switch de forma prematura?");
        System.out.println("a. stop \n b. break \n c. exit \n d. return");
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

        // PREGUNTA 17
        System.out.println("\n17. ¿Cuál de los siguientes es un contenedor de tamaño dinámico en Java?");
        System.out.println("a. Array tradicional \n b. ArrayList \n c. Variable primitiva \n d. Matrix fija");
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

        // PREGUNTA 18
        System.out.println("\n18. ¿Qué método de la clase String se utiliza para obtener su longitud?");
        System.out.println("a. size() \n b. length() \n c. getLength() \n d. count()");
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

        // PREGUNTA 19
        System.out.println("\n19. ¿Cuál de las siguientes opciones declara correctamente un arreglo de enteros de 5 elementos?");
        System.out.println("a. int arr = new int[5]; \n b. int[] arr = {1, 2, 3, 4, 5}; \n c. int arr[] = new int(); \n d. array int arr = 5;");
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

        // PREGUNTA 20
        System.out.println("\n20. ¿Qué modificador de acceso hace que un miembro sea accesible solo dentro de su propia clase?");
        System.out.println("a. public \n b. protected \n c. private \n d. default");
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

        // PREGUNTA 21
        System.out.println("\n21. ¿Qué palabra clave se usa para heredar una clase en Java?");
        System.out.println("a. implements \n b. extends \n c. inherits \n d. supers");
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

        // PREGUNTA 22
        System.out.println("\n22. ¿Cómo se llama el archivo generado tras compilar código fuente de Java (.java)?");
        System.out.println("a. .exe \n b. .class \n c. .obj \n d. .jv");
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

        // PREGUNTA 23
        System.out.println("\n23. ¿Qué operador se utiliza para evaluar una condición de negación (NOT)?");
        System.out.println("a. ! \n b. ~ \n c. ? \n d. :");
        System.out.print("Tu respuesta: ");
        respuesta = scanner.nextLine().trim().toLowerCase();

        if (!respuesta.matches("[abcd]")) {
            System.out.println("Respuesta no válida: a, b, c, d");
            System.out.println("El programa ha terminado por entrada incorrecta.");
            System.exit(0);
        }
        if (respuesta.equals("a")) {
            System.out.println("¡Respuesta correcta!");
            aciertos++;
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: a");
        }

        // PREGUNTA 24
        System.out.println("\n24. ¿Qué clase se utiliza en Java para representar cadenas de caracteres mutables (modificables)?");
        System.out.println("a. String \n b. StringBuilder \n c. StringConstant \n d. CharArrayOnly");
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

        // PREGUNTA 25
        System.out.println("\n25. ¿Cuál es el tipo de dato que devuelve el método charAt() de la clase String?");
        System.out.println("a. String \n b. int \n c. char \n d. boolean");
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

        return aciertos;
    }
}