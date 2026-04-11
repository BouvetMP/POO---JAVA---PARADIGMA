# Abstracción

## Definición
Este paradigma trata sobre la simplificación de las características escenciales de un objeto o concepto, ocultando detalles irrelevantes en el proceso. 

## Idea Clave
Ayuda a crear objetos en general y evita que los mismos tengan que tener bloques de código similares.

## Clases Ejemplo
Clase: Figura (Abstracta)
Define el contrato común, obliga a calcular el área y ofrece un comportamiento compartido con mostrarTipo().

Clase: Circulo
Implementa el cálculo del área usando la fórmula π·r², recibiendo el radio como parámetro.

Clase: Rectangulo
Implementa el cálculo del área multiplicando base por altura.

Clase: Main
Es el punto de arraque del programa con el fin de demostrar el paradigma.

## Como Ejecutar
1. Abrir terminal en la carpeta que contiene el paquete Abstraccion
2. Compilar con: javac Abstraccion/*.java
3. Ejecutar con: java Abstraccion.Main

## Salida esperada
Soy una figura Geométrica.
Área del circulo: 78.53981633974483
Soy una figura Geométrica.
Área del rectángulo: 24.0

## Aprendizaje
Que este paradigma ayuda mucho a la optimizacion del codigo ya que hace que las clases hijas obtengan un metodo sin tener que repetir la lógica.