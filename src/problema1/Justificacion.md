# Problema 1

## Explicación

El algoritmo verifica si un arreglo está ordenado de menor a mayor utilizando recursión.

La función compara cada elemento con el siguiente elemento del arreglo. Si encuentra un número mayor que el siguiente, retorna false porque el arreglo ya no está ordenado.

Si llega hasta el final sin encontrar errores, retorna true.

---

## Caso base

El caso base ocurre cuando el índice llega al último elemento del arreglo.

```java
if (indice == arreglo.length - 1)
```

En este caso ya no existen más elementos por comparar y el arreglo se considera ordenado.

---

## Recurrencia

T(n) = T(n-1) + c

Donde:
- T(n-1) representa la llamada recursiva.
- c representa el tiempo constante de la comparación.

---

## Complejidad temporal

La complejidad temporal es:

O(n)

Porque el algoritmo recorre el arreglo una sola vez.

---

## Conclusión

La recursión permite verificar el orden del arreglo de forma sencilla comparando cada elemento con el siguiente hasta llegar al final.