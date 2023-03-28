# ESI Launcher

## ¿Qué es ESI Launcher?
ESI Launcher es un proyecto simple que hice ya que estoy estudiando programación y quiero tener los proyectos
organizados en un repositorio de GitHub.

## ¿Por qué todas las clases tienen el método main?

Esto es debido a que el módulo bootstrap cargará la clase que tú desees en caso de que decidas lanzarlo con el mismo.

En cambio, si solo quieres usar una parte del código o tener la clase entera, no necesitas copiarte el launcher o el
código del mismo. Ahorrando mucho tiempo al entregar una tarea.

## ¿Aceptas issues o pull requests?

No, ya que como especifiqué antes, esto es solo para tener mis proyectos de clase, nada más.

## Compilar

Para compilar requieres de:
- Java Development Kit 8.
- Maven

Para compilar simplemente ejecuta el comando:
```bash
mvn clean install
```

## Ejecutar

Antes de ejecutarlo, asegúrate de haberlo compilado con el paso anterior, luego, estando en la carpeta raíz del
proyecto, puedes ejecutar el launcher desde una consola con el comando:
```bash
java -jar bootstrap/target/ESI-Launcher-Bootstrap.jar
```