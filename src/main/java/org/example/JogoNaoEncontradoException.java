package org.example;

public class JogoNaoEncontradoException extends Exception {

    public JogoNaoEncontradoException(String gameNotFound) {
        super(gameNotFound);
    }
}
