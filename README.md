Modificación de Arreglo
Este programa toma una secuencia de elementos (pueden ser caracteres o números) como entrada, divide el arreglo en dos mitades, y 
desplaza los elementos de las mitades alternativamente hacia la izquierda o derecha, en función de un valor T proporcionado por el usuario. El programa asegura que el número de elementos es par y manipula el arreglo de forma eficiente sin usar arreglos auxiliares.

 - Funcionalidades -

Entrada del usuario:
Se solicita al usuario que ingrese una secuencia de elementos separados por espacios.
El número total de elementos debe ser par (el programa repetirá la solicitud si la entrada no cumple con esta condición).

Valor T:
El programa solicita un valor entero T que indica cuántos desplazamientos deben realizarse. Cada desplazamiento consiste en mover un elemento a la izquierda (para la primera mitad del arreglo) o a la derecha (para la segunda mitad).

Modificación del arreglo:
La secuencia de elementos se divide en dos mitades.
La primera mitad se desplaza hacia la derecha primero y en una siguiente iteracion la segunda mitad alternadamente T veces.

Salida:
El programa imprime el arreglo final después de realizar los desplazamientos.

 - Estructura del Código -
- Clases y Métodos
main:
Controla el flujo principal del programa.
Lee la entrada del usuario, valida que el número de elementos sea par, solicita el valor T, y llama a las funciones para modificar y mostrar el arreglo.

modificarArreglo:
Modifica el arreglo de acuerdo con el valor de T.
Alterna entre mover la primera mitad del arreglo hacia la izquierda y la segunda mitad hacia la derecha.

rotar:
Realiza el desplazamiento de un elemento a la izquierda o derecha.

imprimirArreglo:
Imprime el arreglo final después de los desplazamientos.

- Ejemplo ejecucion -

Ingrese la secuencia de elementos (separados por espacios): A B C D E F G H
Ingrese el valor de T: 3

Salida:
Resultado:
C D A B H E F G





