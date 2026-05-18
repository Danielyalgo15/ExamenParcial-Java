# Problema 2

## Explicación

El algoritmo utiliza la técnica de divide y vencerás para encontrar el segundo elemento más grande de un arreglo.

Primero el arreglo se divide en dos mitades. Luego cada mitad busca su elemento mayor y segundo mayor utilizando llamadas recursivas.

Finalmente los resultados se combinan comparando los mayores de cada mitad para determinar el mayor global y el segundo mayor global.

---

## Cómo se combinan los resultados

Cada mitad devuelve:
- el elemento mayor
- el segundo mayor

Al combinar:
- si el mayor de la izquierda es más grande que el de la derecha, entonces el segundo mayor será el máximo entre:
  - el segundo mayor de la izquierda
  - el mayor de la derecha

En caso contrario:
- el segundo mayor será el máximo entre:
  - el segundo mayor de la derecha
  - el mayor de la izquierda

---

## Caso base

Existen dos casos base:

### Un elemento

```java
if (inicio == fin)
```

Cuando solo existe un elemento, este será el mayor y no existirá segundo mayor.

### Dos elementos

```java
if (fin - inicio == 1)
```

Cuando existen dos elementos, se comparan directamente para determinar cuál es el mayor y cuál es el segundo mayor.

---

## Recurrencia

T(n) = 2T(n/2) + c

Donde:
- 2T(n/2) representa las dos llamadas recursivas.
- c representa las comparaciones realizadas al combinar resultados.

---

## Complejidad temporal

La complejidad temporal es:

O(n)

Porque el algoritmo divide el arreglo en partes más pequeñas y realiza una cantidad constante de comparaciones en cada combinación.

---

## Conclusión

La técnica divide y vencerás permite resolver el problema de manera eficiente sin necesidad de ordenar completamente el arreglo.