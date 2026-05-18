package problema2;

public class Problema2 {
    static class Resultado {
        int mayor;
        int segundo;
        Resultado(int mayor, int segundo) {
            this.mayor = mayor;
            this.segundo = segundo;
        }
    }
    public static Resultado buscar(int[] arr, int inicio, int fin) {
        if (inicio == fin) {
            return new Resultado(arr[inicio], -1);
        }
        if (fin - inicio == 1) {
            if (arr[inicio] > arr[fin]) {
                return new Resultado(arr[inicio], arr[fin]);
            } else {
                return new Resultado(arr[fin], arr[inicio]);
            }
        }
        int medio = (inicio + fin) / 2;
        Resultado izquierda = buscar(arr, inicio, medio);
        Resultado derecha = buscar(arr, medio + 1, fin);
        Resultado resultado;
        if (izquierda.mayor > derecha.mayor) {

            resultado = new Resultado(izquierda.mayor, Math.max(izquierda.segundo, derecha.mayor));
        } else {
            resultado = new Resultado(derecha.mayor, Math.max(derecha.segundo, izquierda.mayor));
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] arreglo = {8, 3, 10, 5, 7};
        Resultado r = buscar(arreglo, 0, arreglo.length - 1);
        System.out.println("Segundo elemento mas grande: " + r.segundo);
    }
}