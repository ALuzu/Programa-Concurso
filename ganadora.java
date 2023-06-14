public class ganadora {
    private String[] nombres;
    private String[] apellidos;
    private double[] belleza;
    private double[] sonrisa;
    private double[] inteligencia;

    public ganadora(String[] nombres, String[] apellidos, double[] belleza, double[] sonrisa, double[] inteligencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.belleza = belleza;
        this.sonrisa = sonrisa;
        this.inteligencia = inteligencia;
    }

    public void mostrarGanadora() {
        int winner = 0;
        double promMay = calcularPromedio(0);

        for (int i = 1; i < nombres.length; i++) {
            double promedio = calcularPromedio(i);
            if (promedio > promMay) {
                promMay = promedio;
                winner = i;
            }
        }

        System.out.println("La ganadora es: " + nombres[winner] + " " + apellidos[winner]);
        System.out.println();
        System.out.println("Calificaciones:");
        System.out.println("Belleza: " + belleza[winner]);
        System.out.println("Sonrisa: " + sonrisa[winner]);
        System.out.println("Inteligencia: " + inteligencia[winner]);
        System.out.println();
        System.out.println("Calificación final: " + promMay);
        System.out.println();
    }

    private double calcularPromedio(int valorFinal) {
        return (belleza[valorFinal] + sonrisa[valorFinal] + inteligencia[valorFinal]) / 3;
    }
}
