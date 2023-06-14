import java.util.Scanner;

public class menu {
    private informacion informacion;
    private calificacion calificacion;
    private ganadora ganadora;

    public menu(){
    informacion = new informacion();
    calificacion = new calificacion();
    ganadora = new ganadora(calificacion.getNombres(), calificacion.getApellidos(), calificacion.getBelleza(), calificacion.getSonrisa(), calificacion.getInteligencia());
    }

    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
        System.out.println("MENU");
        System.out.println("Opcion 1. Ver información");
        System.out.println("Opcion 2. Calificar");
        System.out.println("Opcion 3. Ver ganadora");
        System.out.println("Opcion 4. Salir");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu opción: ");
        System.out.println();
        int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    informacion.mostrarInformacion();
                    break;
                case 2:
                    calificacion.calificarConcursantes();
                    break;
                case 3:
                    ganadora.mostrarGanadora();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.\n");
            }
        }
        System.out.println("Saliendo...");
        System.exit(0);
    }
}
