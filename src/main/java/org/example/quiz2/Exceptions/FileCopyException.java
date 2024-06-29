package org.example.quiz2.Exceptions;

import java.io.IOException;

public class FileCopyException extends IOException {
    public FileCopyException(String message) {
        super(message);
    }
}
