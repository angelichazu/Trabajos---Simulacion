import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
        // VARIABLES
        Scanner entrada = new Scanner(System.in);
        int bucle = 0;
        int suma = 0;
        double[] valores;
        HistogramDataset data = new HistogramDataset();
        ////////////////////////////////////////////////

        /// MENU
        System.out.println(".:: BIENVENIDOS ::.");
        System.out.print("Ingrese el numero de simulacion: ");
        bucle = entrada.nextInt();
        valores = new double[bucle];
        System.out.println("###############################################################");

        /// GENERACION DE LA SIMULACION

        for (int i = 0; i < bucle; i++) {
            suma = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
            System.out.print("Simulacion num " + (i + 1) + " :" + suma + " | ");
            valores[i] = suma;
        }
        data.addSeries("Dados",valores,11);
        System.out.println("");
        System.out.println("###############################################################");

        // GENERAR GRAFICOS

        JFreeChart chart = ChartFactory.createHistogram(
                "Histograma - Simulacion (" + bucle + " Valores)",
                "Suma",
                "Repeticiones",
                data,
                PlotOrientation.VERTICAL, true, true, false);

        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("Simulacion", chart);
        frame.pack();
        frame.setVisible(true);

    }
}
