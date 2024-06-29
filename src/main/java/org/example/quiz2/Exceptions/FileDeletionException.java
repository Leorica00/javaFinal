package org.example.quiz2.Exceptions;

import java.io.IOException;

public class FileDeletionException extends IOException {
    public FileDeletionException(String message) {
        super(message);
    }
}