# PrincipiosSolid
## 1. OCP
La clase figura no maneja el principio ocp ya continen metodos para dos tipos de figura lo que significa que  al ingresara una diferete
figura se debe modificar el codigo de la clase figura.

### Refactorizacion de la clase figuras
1. Crear un vector de elementos de la clase figura figuras.
2. Crear un metodo para agregar cualquier tipo de figura al vector del paso 1.
3. Crear un Enumeracion de la clase figuras que contendra los elementos del vector figuras.
4. Modificar el ciclo while para imprimir objetos de la clase figura.

### Refactorizacion de la clase figura 
1. Se modifica la clase combirtiendola en una interface.
### Refactorizacion de las clses Circulo y Cuadrado
Las clases ahora implementan la interface figura y sobreescribiendo su metodo dibujar

### ¿Consideras que la tarea realizada es una refactorización?
No, ya que solo se cambia los objetos que recibian los metodos de la anterior clase figura, Mas no se modifica la 
estructura de la clase.

## 2. Liskov
