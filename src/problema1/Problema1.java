package problema1;
public class Problema1 {
    public static boolean estaOrdenado(int[] arreglo, int indice) {
        if (indice == arreglo.length - 1) {
            return true;
        }
        if (arreglo[indice] > arreglo[indice + 1]) {
            return false;
        }
        return estaOrdenado(arreglo, indice + 1);
    }
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 5, 8};
        int[] arreglo2 = {1, 4, 2, 8};
        System.out.println("Arreglo 1 ordenado: " + estaOrdenado(arreglo1, 0));
        System.out.println("Arreglo 2 ordenado: " + estaOrdenado(arreglo2, 0));
    }
}