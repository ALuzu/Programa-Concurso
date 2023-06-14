import java.util.Scanner;
public class calificacion {
    private String[] nombres;
    private String[] apellidos;
    private double[] belleza;
    private double[] sonrisa;
    private double[] inteligencia;

    public calificacion() {
        nombres = new String[]{"Camila", "Abigail", "Mikaela"};
        apellidos = new String[]{"Sosa", "Vinueza", "Salgado"};
        belleza = new double[3];
        sonrisa = new double[3];
        inteligencia = new double[3];
    }

    public void calificarConcursantes() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese la calificación de la concursante: " + nombres[i] + " " + apellidos[i]);
            System.out.print("Belleza (1-10): ");
            belleza[i] = scanner.nextDouble();
            System.out.print("Sonrisa (1-10): ");
            sonrisa[i] = scanner.nextDouble();
            System.out.print("Inteligencia (1-10): ");
            inteligencia[i] = scanner.nextDouble();
            System.out.println();
        }

        System.out.println("Calificaciones registradas...");

        for (int i = 0; i < nombres.length; i++) {
            double promedio = (belleza[i] + sonrisa[i] + inteligencia[i]) / 3;
            System.out.println("Calificacion final de " + nombres[i] + " " + apellidos[i] + ": " + promedio);
        }
    }
    
    public String[] getNombres(){
        return nombres;
    }
    public String[] getApellidos() {
        return apellidos;
    }    
    public double[] getBelleza() {
        return belleza;
    }
    public double[] getSonrisa() {
        return sonrisa;
    }
    public double[] getInteligencia() {
        return inteligencia;
    }
}