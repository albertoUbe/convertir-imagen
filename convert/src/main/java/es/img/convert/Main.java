package es.img.convert;

import java.io.IOException;

import es.img.convert.Clases.Comando;
import es.img.convert.Clases.ConversorImpl;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.err.println("Uso: java Main <imagen_entrada> <imagen_salida>");
            System.exit(1);
        }

        String entradaImagen = args[0];
        String salidaImagen = args[1];

        String[] comando = {Comando.COMANDO[0], entradaImagen, salidaImagen};

        ConversorImpl conversion = new ConversorImpl();
        conversion.conversor(comando);

    }
}