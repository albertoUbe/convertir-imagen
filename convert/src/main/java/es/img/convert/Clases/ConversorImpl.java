package es.img.convert.Clases;

import java.io.IOException;

import es.img.convert.Interfaz.Conversor;

public class ConversorImpl implements Conversor{

    private static final String MSG_EXITO = "Éxito en la conversión.";
    private static final String MSG_ERROR = "Error de conversión.";

    @Override
    public void conversor(String[] comando) throws IOException {

        Process process = Runtime.getRuntime().exec(comando);

        int exitVal;
        try {
            exitVal = process.waitFor();

            if (exitVal == 0) {
            System.out.println(MSG_EXITO);
            System.exit(0);
        } else {
            System.out.println(MSG_ERROR);
            System.exit(1);
        }
        } catch (InterruptedException e) {
            e.getMessage();
        }

    }
    
}
