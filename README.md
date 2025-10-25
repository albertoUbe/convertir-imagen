# 🗃️ Conversion de imagenes en Linux `convert`

Desarrollo de un programa que pide por parámetro el nombre de una imagen de entrada y el nombre de la imagen de salida (conversión).

Se lanza el comando `convert` de Linux y se introduce por parámetro la imagen con un formato de entrada y la imagen con el formato de salida.

Crea la imagen de salida.

---

## 📦 Estructura del Proyecto

📁 es.img.convert

    📁 Clases
  
      📄 Comando.java

      📄 ConversorImpl.java

   📁 Interfaz
  
      📄 Conversor.java
  
  
  📄 Main.java

---

## 🧑‍💻 Ejecución

Compilar y ejecutar el programa por consola con maven: desde la carpeta raíz donde se encuentra el `pom.xml`.

```bash
mvn clean compile `(desde convert)`
java -cp target/classes es.img.convert src/main/resources/last_shot.png src/main/resources/last_shot.jpg ```
```

Mostrara las siguientes imágenes dentro de `src/main/resources`:

> last_shot.jpg
>
> last_shot.png
