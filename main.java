import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Usuario y contraseña establecidos
        String usuario = "USUARIO";
        String password = "12345";

        // Ciclo para repetir el proceso en caso de que no coincida
        boolean inicioExitoso = false;
        while (!inicioExitoso) {
            // Solicitar usuario y contraseña por consola
            Scanner scanner = new Scanner(System.in);
            System.out.print("Usuario: ");
            String newUsuaario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String newPassword = scanner.nextLine();

            // Verificar usuario y contraseña
            if (newUsuaario.equals(usuario) && newPassword.equals(password)) {
                System.out.println("Inicio de sesión exitoso.");
                System.out.println();
                inicioExitoso = true;
                menu menu1 = new menu();
                menu1.mostrarMenu();
            } else {
                System.out.println("Usuario o contraseña incorrectos. Inténtalo de nuevo.\n");
            }
        }
    }
}