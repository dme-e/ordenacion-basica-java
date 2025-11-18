# Métodos de Ordenación en Java (Inserción, Selección y Burbuja)

---

## Descripción del Proyecto

Este proyecto implementa tres algoritmos fundamentales de ordenación en Java: **Inserción (Insertion Sort)**, **Selección (Selection Sort)** y **Burbuja (Bubble Sort)**. 

El proyecto proporciona herramientas interactivas para:
- Ejecutar estos algoritmos con diferentes conjuntos de datos
- Visualizar el trazado paso a paso de cada algoritmo
- Contabilizar operaciones (intercambios, movimientos e iteraciones)
- Comparar el desempeño en diferentes escenarios
- Incluye un menú interactivo que permite llenar arreglos de forma manual o automática

---

## Detalles de Implementación

### Características Principales

#### Algoritmos In-Place
- Los tres algoritmos modifican el arreglo original sin utilizar estructuras de datos adicionales. 
- El espacio auxiliar utilizado es **O(1)** en todos los casos.

#### Métodos `sort(int[] a, boolean trace)`
Todos los algoritmos implementan dos versiones del método sort:

- sort(int[] array): Versión sin trazado (parámetro trace = false por defecto)
- sort(int[] array, boolean trace): Versión con opción de mostrar trazado paso a paso

#### Corte Temprano en BubbleSort
- El algoritmo de burbuja incluye un mecanismo de optimización que detiene el proceso si en una pasada no hay intercambios, indicando que el arreglo ya está ordenado. Esto reduce significativamente el tiempo de ejecución en arreglos parcialmente ordenados o ya ordenados.

#### Contabilización de Intercambios en SelectionSort
- Se registra el número total de intercambios realizados durante la ejecución del algoritmo, permitiendo análisis detallado del comportamiento.

#### Movimiento por Iteración en InsertionSort
- Se contabilizan tanto los movimientos de elementos como el número de iteraciones realizadas, proporcionando una visión detallada del proceso de ordenación.

---

## Casos Borde Probados

El proyecto ha sido probado exhaustivamente con los siguientes casos especiales:

- ✓ **Arreglo vacío**: Arreglos con longitud 0
- ✓ **Arreglo de tamaño 1**: Un único elemento
- ✓ **Elementos iguales**: Todos los elementos con el mismo valor
- ✓ **Arreglo ya ordenado**: Lista en orden ascendente desde el inicio
- ✓ **Arreglo en orden inverso**: Lista completamente en orden descendente
- ✓ **Arreglo con duplicados**: Múltiples elementos repetidos de forma aleatoria

---

## Cómo Ejecutar el Programa

### Desde Consola / Terminal

#### 1. Navega a la carpeta del proyecto:
```bash
cd "C:\Users\USUARIO\OneDrive\Documents\dome\Estructura de Datos\Algoritmos_Ordenacion"
```

#### 2. Compila el proyecto con Maven:
```bash
mvn clean compile
```

#### 3. Ejecuta la aplicación:
```bash
mvn exec:java -Dexec.mainClass="ed.u2.sorting.SortingDemo"
```

#### 4. Ejecuta las pruebas unitarias:
```bash
mvn test
```

### Desde IntelliJ IDEA

#### Abre el proyecto en IntelliJ:
1. Abre **IntelliJ IDEA**
2. Selecciona **File → Open**
3. Navega a la carpeta del proyecto
4. Haz clic en **Open**

#### Ejecuta la aplicación principal:
1. Localiza `SortingDemo.java` en `src/main/java/ed/u2/sorting/`
2. Haz clic derecho sobre la clase
3. Selecciona **Run 'SortingDemo.main()'**
4. O presiona **Shift + F10** con el archivo abierto

#### Ejecuta las pruebas:
1. Localiza las clases de prueba en `src/test/java/ed/u2/sorting/`
2. Haz clic derecho sobre `SortingTest`
3. Selecciona **Run 'SortingTest'**
4. O presiona **Ctrl + Shift + F10**

#### Configuración opcional (mediante Maven en IntelliJ):
1. Ve a **Run → Edit Configurations**
2. Crea una nueva configuración **Maven**
3. Establece el comando: `exec:java -Dexec.mainClass="ed.u2.sorting.SortingDemo"`

---