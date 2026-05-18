# Problema 3

## Explicación

El algoritmo utiliza la técnica divide y vencerás para contar el número de inversiones en un arreglo.

Una inversión ocurre cuando un elemento aparece antes que otro elemento menor.

Ejemplo:

```text
[3,1,2]
```

Inversiones:
- (3,1)
- (3,2)

Resultado:
- 2 inversiones

El algoritmo divide el arreglo en dos mitades y cuenta las inversiones en cada parte utilizando recursión.

Después, durante el proceso de combinación (merge), también cuenta las inversiones entre elementos de la izquierda y la derecha.

---

## Cómo se detectan las inversiones

Durante el merge se comparan elementos de ambas mitades.

Si:

```java
arreglo[i] > arreglo[j]
```

significa que existe una inversión.

Además, como la mitad izquierda ya está ordenada, todos los elementos restantes de la izquierda también serán mayores que `arreglo[j]`.

Por eso se utiliza:

```java
inversiones += (medio - i + 1);
```

para contar varias inversiones al mismo tiempo.

---

## Caso base

El caso base ocurre cuando el arreglo tiene un solo elemento:

```java
if (inicio < fin)
```

Cuando ya no es posible dividir más el arreglo, la función retorna 0 inversiones.

---

## Recurrencia

T(n) = 2T(n/2) + n

Donde:
- 2T(n/2) representa las llamadas recursivas.
- n representa el proceso de combinación del merge.

---

## Complejidad temporal

La complejidad temporal es:

O(n log n)

Porque el algoritmo divide el arreglo en mitades y realiza el merge en tiempo lineal.

---

## ¿Por qué es más eficiente?

El algoritmo es más eficiente que revisar todos los pares posibles porque no compara cada elemento con todos los demás.

En lugar de utilizar fuerza bruta con complejidad O(n²), utiliza divide y vencerás para reducir el número de comparaciones.

---

## Conclusión

La técnica divide y vencerás permite contar inversiones de manera eficiente aprovechando el proceso de combinación del merge sort.