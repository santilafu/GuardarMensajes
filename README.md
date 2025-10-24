# 🗂️Gestión de Escritura en Ficheros (Acceso a Datos – Unidad 1)
## Actividad 2
## Enunciado
La aplicación debe permitir escribir mensajes en un fichero de texto almacenado en la máquina donde se ejecuta el programa.  
El fichero estará ubicado dentro de una carpeta llamada **Recursos**, situada en el directorio del proyecto Java.

Cada vez que se ejecute la aplicación, deberá añadirse la frase:


de forma que el mensaje se conserve entre ejecuciones (no debe sobrescribirse el contenido anterior).

---

## Objetivo de la Actividad
- Practicar el uso de clases de gestión de ficheros en Java.
- Crear y organizar rutas dentro del directorio del proyecto.
- Escribir en un archivo utilizando flujo de escritura con buffer.
- Asegurar la persistencia de datos en el fichero.

---

## Funcionamiento General
1. Crear una carpeta llamada **Recursos** en la raíz del proyecto.
2. Comprobar o generar automáticamente el archivo `mensaje.txt` dentro de dicha carpeta.
3. Añadir la frase indicada al final del archivo cada vez que se ejecute el programa.
4. Mantener el contenido anterior del fichero (modo de escritura con append).
5. Verificar que el archivo refleja correctamente las diferentes ejecuciones.

---

## Resultado Esperado
Tras varias ejecuciones consecutivas, el contenido del fichero será similar a:

````
este es un ejemplo de escritura
este es un ejemplo de escritura
este es un ejemplo de escritura
````


Cada ejecución añade una nueva línea.

---

## Herramientas Utilizadas
- Lenguaje: **Java**
- IDE utilizado: **IntelliJ IDEA** 
- Clases de la API estándar de Java para manejo de ficheros y escritura con buffer.

---

