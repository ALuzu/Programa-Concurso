public class informacion {
    private String[] nombres;
    private String[] apellidos;
    private double[] estaturas;
    private int[] edades;

    public informacion() {
        nombres = new String[] { "Particpante", "Particpante", "Particpante" };
        apellidos = new String[] { "1", "2", "3" };
        estaturas = new double[] { 1.55, 1.53, 1.52 };
        edades = new int[] { 25, 23, 24 };
    }

    public void mostrarInformacion() {
        System.out.println("Información de las participantes");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Concursante " + (i + 1));
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Apellido: " + apellidos[i]);
            System.out.println("Estatura: " + estaturas[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println();
        }
    }
}