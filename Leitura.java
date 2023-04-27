/*
 * Nome: Gabriella Ribeiro de Melo e Costa
 * RA: 2487837
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {

    public String entDados(String enunciado){
        System.out.println(enunciado);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);
        
        String ret ="";

        try {
            ret = buff.readLine();
        }

        catch(IOException ioe) {
            System.out.println("\nERRO de sistema: RAM- TECLADO");
        }

        return ret;
    }

}