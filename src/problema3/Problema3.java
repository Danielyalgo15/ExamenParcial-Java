package problema3;
public class Problema3 {
    public static int contarInversiones(int[] arreglo, int inicio, int fin) {
        int inversiones = 0;
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            inversiones += contarInversiones(arreglo, inicio, medio);
            inversiones += contarInversiones(arreglo, medio + 1, fin);
            inversiones += merge(arreglo, inicio, medio, fin);
        }
        return inversiones;
    }
    public static int merge(int[] arreglo, int inicio, int medio, int fin) {
        int[] temp = new int[fin - inicio + 1];
        int i = inicio;
        int j = medio + 1;
        int k = 0;
        int inversiones = 0;
        while (i <= medio && j <= fin) {
            if (arreglo[i] <= arreglo[j]) {
                temp[k++] = arreglo[i++];
            } else {
                temp[k++] = arreglo[j++];
                inversiones += (medio - i + 1);
            }
        }
        while (i <= medio) {
            temp[k++] = arreglo[i++];
        }
        while (j <= fin) {
            temp[k++] = arreglo[j++];
        }
        for (i = inicio, k = 0; i <= fin; i++, k++) {
            arreglo[i] = temp[k];
        }
        return inversiones;
    }
    public static void main(String[] args) {
        int[] arreglo = {3, 1, 2};
        int resultado = contarInversiones(arreglo, 0, arreglo.length - 1);
        System.out.println("Numero de inversiones: " + resultado);
    }
}