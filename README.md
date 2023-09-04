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
1. Crea un programa principal que ejecute los métodos de la clase Configuración.
2. Cumple la clase Configuracion en Principio OCP. Justifica la respuesta.

   Si cumple, ya que para añadir nuevas configuraciones solo debemos crear la clase que implemente la interface 
RecursoPersistente y solo debemos agregar la linea en el metodo cargarConfiguracion.

3. Cumple la clase Configuracion el Principio de Liskov. Justifica la respuesta. 
   
   No cumple, ya que la clase ConfiguracionHoraria solo podria  implementar el metodo cargar hora y no deberia salvar la
configuracion de hora.  El pricipio indica que toda subclase debe usar todos los metodos de la claseSuper y en este caso se incumple

4. Explica de forma general (independientemente del ejemplo) cual es el problema y la solución propuesta.
   
   Toda sub clase  debe implementar todos los metodos de la superclase, si una subclase no utiliza uno de los metodos 
significa que se incumple el principio de liskov, en este caso se extraen los metodos  que tenia la superclase en interfaces y se implemtas en cada sub clase solo los metodos que esta usara, de esta forma no se incumple el principio.