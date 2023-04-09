package PasswordManager;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager {

    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String username, password;

        while (true) {
            System.out.println("Bienvenido al Administrador de Contraseñas y Usuarios");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de usuario:");
                    username = scanner.nextLine();
                    System.out.println("Ingrese la contraseña:");
                    password = scanner.nextLine();

                    if (users.containsKey(username)) {
                        System.out.println("El nombre de usuario ya existe. Por favor, intente con otro.");
                    } else {
                        users.put(username, password);
                        System.out.println("Cuenta creada exitosamente.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de usuario:");
                    username = scanner.nextLine();
                    System.out.println("Ingrese la contraseña:");
                    password = scanner.nextLine();

                    if (users.containsKey(username)) {
                        if (users.get(username).equals(password)) {
                            System.out.println("Inicio de sesión exitoso.");
                        } else {
                            System.out.println("Contraseña incorrecta. Intente nuevamente.");
                        }
                    } else {
                        System.out.println("El nombre de usuario no existe. Por favor, cree una cuenta primero.");
                    }
                    break;
                case 3:
                    System.out.println("¡Gracias por usar nuestro programa!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
