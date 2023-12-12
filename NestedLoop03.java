import java.util.Scanner;

/**
 * NestedLoop03
 */
public class NestedLoop03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[][] temps = new double[5][7];
    
    for (int i = 0; i < temps.length; i++) {
        System.out.println("City : " + i);
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Day " + (j + 1) + ": ");
            temps[i][j] = scanner.nextDouble();
        }
        System.out.println();
    }
      for (int i = 0; i < temps.length; i++) {
        System.out.println("City : " + i);
        for (double temp : temps[i]) {
            System.out.print(temp + " ");
        }
        System.out.println();
       
        for (int j = 0; i < temps.length; i++) {
            System.out.println("City : " + i);
            double totalTemperature = 0;

            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                totalTemperature += temp;
            }

            double averageTemperature = totalTemperature / temps[i].length;
            System.out.println("\nAverage Temperature: " + averageTemperature);
            System.out.println();
        }
        scanner.close();
    }
}
}