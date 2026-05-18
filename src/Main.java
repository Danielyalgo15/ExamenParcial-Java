import problema1.Problema1;
import problema2.Problema2;
import problema3.Problema3;
public class Main {
    public static void main(String[] args) {
        // =====================
        // PROBLEMA 1
        // =====================
        int[] arreglo1 = {1, 2, 3, 4};
        boolean ordenado =
                Problema1.estaOrdenado(arreglo1, 0);
        System.out.println("PROBLEMA 1");
        System.out.println("Arreglo ordenado: " + ordenado);
        // =====================
        // PROBLEMA 2
        // =====================
        int[] arreglo2 = {8, 3, 10, 5, 7};
        Problema2.Resultado resultado =
                Problema2.buscar(arreglo2, 0, arreglo2.length - 1);
        System.out.println("\nPROBLEMA 2");
        System.out.println("Segundo elemento mas grande: " + resultado.segundo);
        // =====================
        // PROBLEMA 3
        // =====================
        int[] arreglo3 = {3, 1, 2};
        int inversiones =
                Problema3.contarInversiones(arreglo3, 0, arreglo3.length - 1);
        System.out.println("\nPROBLEMA 3");
        System.out.println("Numero de inversiones: " + inversiones);
    }
}