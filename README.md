# Prueba_Patrones_Estructurales

# Repositorio: https://github.com/DiegoCG1013/Prueba_Patrones_Estructurales/tree/master

### Ejercicio 1 
Una empresa de mobiliario modular realiza ventas de varios tipos de «elementos». 
Los elementos pueden ser piezas simples o grupos de «elementos» que forma un «kit», 
con lo que un «kit» es un grupo de «elementos» de cualquiera de los dos tipos.
Para cada tipo de elemento simple existe una clase definida que lo modela, heredera 
de la clase ELEMENTO que dispone de características diferidas precio:REAL y 
codigo:INTEGER, sin embargo no existe en el sistema ninguna clase que modele el «kit».
Elabore el diagrama de clases así como el código en Java correspondiente de un 
sistema que permita la gestión de los elementos que vende la empresa, considerando que 
cada «kit» tendrá un código numérico propio, y que el precio de un «kit» se calcula como 
la suma de los precios de sus elementos, pero con un descuento del 10 %. Implemente completamente 
la clase que permite modelar un «kit», prestando especial atención a su construcción y al cálculo 
de su precio, que debe realizarse en tiempo de ejecución.

### RESULTADOS 
He empleado un composite para modelar los kits, de manera que los elementos y los kits son componentes, 
y dentro de los kits hay componentes, todos con el metodo getPrice.

