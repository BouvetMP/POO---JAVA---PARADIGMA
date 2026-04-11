# Polimorfismo

## Definición
Este paradigma trata del como un método actua de forma diferente correpondiente al objeto que use ese método logrando adaptar un mensaje a diferentes sujetos.

## Idea Clave
Lo principal en este paradigma es que ayuda a manejar situaciones en donde varios objetos tienen que actuar de una forma sin la necesidad de elaborar métodos diferentes de cada uno.

## Clases Ejemplo
Clase: Animal (Padre)
Define el método hacerSonido() con un comportamiento genérico que las subclases pueden sobreescribir.

Clase: Perro
Extiende Empleado agregando el atributo area y el método mostrarArea().

Clase: Gato
Sobreescribe hacerSonido() con su comportamiento específico: ladrar.

Clase: Main
Ejecuta el codigo y crea los objetos para representar visualmente la aplicación del paradigma.

## Como Ejecutar
1. Abrir terminal en la carpeta que contiene el paquete polimorfismo
2. Compilar con: javac polimorfismo/*.java
3. Ejecutar con: java polimorfismo.Main

## Salida esperada
El perro ladra
El gato maúlla

## Aprendizaje
Este paradigma ayuda a la creación de multiples objetos similares ya que hace que todos sobreescriban un método y respondan mediante su propia lógica ante ese método.