import java.util.Scanner;

public class MatrizAdyacenciaGrafos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de vértices del grafo: ");
        int numVertices = scanner.nextInt();

        int[][] matrizAdyacencia = new int[numVertices][numVertices];

        System.out.println("Ingrese los pesos o longitudes de los caminos entre los vértices:");

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (i != j) {
                    System.out.print("Peso del camino entre el vértice " + (i + 1) + " y el vértice " + (j + 1) + ": ");
                    matrizAdyacencia[i][j] = scanner.nextInt();
                }
            }
        }

        System.out.println("\nMatriz de adyacencia generada:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdyacencia[i][j] + "\t");
            }
            System.out.println();
        }
    }
}




