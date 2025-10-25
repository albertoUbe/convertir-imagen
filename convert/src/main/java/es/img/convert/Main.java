package es.img.convert;

import java.io.IOException;

import es.img.convert.Clases.Comando;
import es.img.convert.Clases.ConversorImpl;
import es.img.convert.Clases.Imagen;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] comando = {Comando.COMANDO[0], Imagen.IMAGEN_ENTRADA, Imagen.IMAGEN_SALIDA};

        ConversorImpl conversion = new ConversorImpl();

        conversion.conversor(comando);

    }
}