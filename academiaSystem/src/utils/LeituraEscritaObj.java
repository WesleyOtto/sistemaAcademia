/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
 import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wesle
 */
public class LeituraEscritaObj {

    public LeituraEscritaObj() {
    }

    public static void salvar(Connect objeto) throws IOException {

        String driver = objeto.getDriver() + "\n";
        String getUrl = objeto.getUrl() + "\n";
        String usuario = objeto.getUsuario() + "\n";
        String senha = objeto.getSenha();

        File file = new File("src\\utils\\configBanco.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(driver);
        bw.write(getUrl);
        bw.write(usuario);
        bw.write(senha);
        bw.close();
    }

    public static Connect restaurar() throws FileNotFoundException, IOException {
        Connect connect = new Connect();

        FileReader ler = new FileReader("src\\utils\\configBanco.txt");
        BufferedReader reader = new BufferedReader(ler);
        connect.setDriver(reader.readLine());
        connect.setUrl(reader.readLine());
        connect.setUsuario(reader.readLine());
        connect.setSenha(reader.readLine());

        return connect;
    }

    public static boolean fileExist() {
        File file = new File("src\\utils\\configBanco.txt");
        return file.exists();
    }

}
