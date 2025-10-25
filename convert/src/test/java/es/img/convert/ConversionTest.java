package es.img.convert;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import es.img.convert.Clases.ConversorImpl;

public class ConversionTest {
    
    @Test
    void conversionTest() {
        String[] comando = {"comando", "comando", "comando"};

        ConversorImpl conversion = new ConversorImpl();

        IOException ioe = assertThrows(IOException.class, () -> conversion.conversor(comando));
        System.out.println(ioe.getMessage());

    }
}