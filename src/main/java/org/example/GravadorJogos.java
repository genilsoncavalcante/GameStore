package org.example;

import java.io.FileInputStream;
import java.io.*;
import java.util.List;

public class GravadorJogos {
    public List<Jogo> lerJogos() throws IOException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("ListaJogos.txt"));
            return (List<Jogo>) in.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("arquivo ListaJogos.txt não encontrado");
        } catch (ClassNotFoundException e) {
            throw new IOException("Classe do objeto gravado no arquivo não encontrada");
        } catch (IOException e) {
            System.err.println("IOexeption em GravadorJogos");
        } finally {
            if (in != null) {
                in.close();
            }
            return new ArrayList<Jogo>;
        }
    }

    public void gravarJogo(List<Jogo> jogos) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("ListaJogos.txt"));
            out.writeObject(jogos);
        } catch (FileNotFoundException e) {
            throw new IOException("Arquivo ListaJogos.text não encontrado", e);
        } catch (IOException e) {
            System.err.println("IOexception em gravarJogos");
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
