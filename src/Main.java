import java.util.Scanner;

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
        return aciertos;
    }
}