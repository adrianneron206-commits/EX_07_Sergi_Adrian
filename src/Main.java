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
    }import java.util.Scanner;

    public class Main {

        // Ejecuta las preguntas de la 26 a la 50 y devuelve los aciertos
        public static int ejecutar(Scanner scanner) {
            int aciertos = 0;
            String respuesta;

            System.out.println("\n--- BLOQUE 2: Preguntas 26 a 50 ---");

// PREGUNTA 26
            System.out.println("\n26. ¿Qué palabra clave se usa para crear una clase en Java?");
            System.out.println("a. class \n b. struct \n c. object \n d. define");
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

// PREGUNTA 27
            System.out.println("\n27. ¿Cuál de los siguientes no es un pilar fundamental de la Programación Orientada a Objetos?");
            System.out.println("a. Herencia \n b. Polimorfismo \n c. Compilación \n d. Encapsulamiento");
            System.out.print("Tu respuesta: ");
            respuesta = scanner.nextLine().trim().toLowerCase();

            if (!respuesta.matches("[abcd]")) { // Validación de entrada
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

// PREGUNTA 28
            System.out.println("\n28. ¿Qué palabra clave se utiliza para instanciar un objeto a partir de una clase?");
            System.out.println("a. create \n b. new \n c. make \n d. instance");
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

// PREGUNTA 29
            System.out.println("\n29. ¿Cómo se denominan los métodos especiales que tienen el mismo nombre que la clase y se usan para inicializar objetos?");
            System.out.println("a. Destructores \n b. Constructores \n c. Mutadores \n d. Herencias");
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

// PREGUNTA 30
            System.out.println("\n30. ¿Qué palabra clave se usa dentro de una clase para referirse a la clase padre o superclase?");
            System.out.println("a. parent \n b. base \n c. super \n d. master");
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

// PREGUNTA 31
            System.out.println("\n31. ¿Qué es el polimorfismo en Java?");
            System.out.println("a. Tener múltiples métodos main \n b. La capacidad de que un objeto se comporte de múltiples formas \n c. Ocultar variables privadas \n d. Duplicar código automáticamente");
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

// PREGUNTA 32
            System.out.println("\n32. ¿Qué palabra clave se utiliza para definir una interfaz en Java?");
            System.out.println("a. interface \n b. protocol \n c. abstract \n d. implements");
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

// PREGUNTA 33
            System.out.println("\n33. ¿Qué palabra clave usa una clase para comprometerse a cumplir los métodos de una interfaz?");
            System.out.println("a. extends \n b. inherits \n c. implements \n d. requires");
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

// PREGUNTA 34
            System.out.println("\n34. ¿Cuál de las siguientes afirmaciones sobre las clases abstractas es correcta?");
            System.out.println("a. Se pueden instanciar directamente con new \n b. No pueden contener métodos abstractos \n c. Pueden contener métodos con y sin implementación \n d. No permiten herencia");
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

// PREGUNTA 35
            System.out.println("\n35. ¿Qué bloque de código se utiliza para capturar excepciones (errores) en Java?");
            System.out.println("a. try-catch \n b. if-else \n c. open-close \n d. start-stop");
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

// PREGUNTA 36
            System.out.println("\n36. ¿Qué palabra clave se usa para asegurar que un bloque de código se ejecute siempre, ocurra o no una excepción?");
            System.out.println("a. always \n b. finally \n c. fallback \n d. ensure");
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

// PREGUNTA 37
            System.out.println("\n37. ¿Qué significa la sigla JVM en el entorno de Java?");
            System.out.println("a. Java Variable Machine \n b. Java Virtual Machine \n c. Justified Virtual Method \n d. Java Verified Module");
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

// PREGUNTA 38
            System.out.println("\n38. ¿Qué componente de Java incluye las herramientas de desarrollo como el compilador javac?");
            System.out.println("a. JRE \n b. JVM \n c. JDK \n d. JIT");
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

// PREGUNTA 39
            System.out.println("\n39. ¿Cuál es el operador de asignación compuesto para sumar y asignar en Java?");
            System.out.println("a. =+ \n b. += \n c. ++ \n d. ==+");
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

// PREGUNTA 40
            System.out.println("\n40. ¿Qué hace el operador de incremento (++i) cuando se coloca antes de la variable?");
            System.out.println("a. Incrementa la variable después de evaluarla \n b. Incrementa la variable antes de usarla en la expresión \n c. Eleva al cuadrado la variable \n d. Multiplica por dos");
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

// PREGUNTA 41
            System.out.println("\n41. ¿Cómo se llama el mecanismo de Java que libera automáticamente la memoria de objetos que ya no se usan?");
            System.out.println("a. MemoryCleaner \n b. Garbage Collector (Recolector de basura) \n c. Destructor Manual \n d. FreeRam");
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

// PREGUNTA 42
            System.out.println("\n42. ¿Qué método se utiliza para comparar el contenido de dos cadenas (String) de forma exacta?");
            System.out.println("a. == \n b. equals() \n c. compareLength() \n d. isSame()");
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

// PREGUNTA 43
            System.out.println("\n43. ¿Qué modificador permite que un método o variable pertenezca a la clase en lugar de a una instancia específica?");
            System.out.println("a. global \n b. static \n c. common \n d. shared");
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

// PREGUNTA 44
            System.out.println("\n44. ¿Cuál de las siguientes opciones describe mejor a un arreglo (array) en Java?");
            System.out.println("a. Una colección de tamaño fijo con elementos del mismo tipo \n b. Una lista que cambia de tamaño automáticamente \n c. Una clase abstracta \n d. Un tipo de dato primitivo único");
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

// PREGUNTA 45
            System.out.println("\n45. ¿Qué sentencia se usa para saltar a la siguiente iteración de un bucle ignorando el resto del código actual?");
            System.out.println("a. skip \n b. continue \n c. next \n d. break");
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

// PREGUNTA 46
            System.out.println("\n46. ¿Qué estructura de datos tipo LIFO (Last In, First Out) proporciona Java en sus librerías?");
            System.out.println("a. Queue \n b. Stack \n c. Map \n d. Set");
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

// PREGUNTA 47
            System.out.println("\n47. ¿Qué interfaz de Java representa una colección que no permite elementos duplicados?");
            System.out.println("a. List \n b. Set \n c. Map \n d. Collection");
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

// PREGUNTA 48
            System.out.println("\n48. ¿Qué estructura almacena pares de clave-valor (Key-Value)?");
            System.out.println("a. Map \n b. List \n c. Array \n d. Stack");
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

// PREGUNTA 49
            System.out.println("\n49. ¿Cómo se le llama al proceso de sobrescribir un método heredado en una subclase?");
            System.out.println("a. Overloading (Sobrecarga) \n b. Overriding (Sobrescritura) \n c. Hiding (Ocultación) \n d. Shadowing");
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

// PREGUNTA 50
            System.out.println("\n50. ¿Cuál es el operador ternario condicional en Java?");
            System.out.println("a. ? : \n b. if ? else : \n c. condition -> true : false \n d. & | !");
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
            return aciertos;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int aciertos = ejecutar(scanner);
            System.out.println("\nHas acertado " + aciertos + " de 25 preguntas.");
            scanner.close();
        }
    }
