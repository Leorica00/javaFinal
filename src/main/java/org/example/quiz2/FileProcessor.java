package org.example.quiz2;

import Exceptions.FileCopyException;
import Exceptions.FileDeletionException;

public interface FileProcessor {
    void copyFile(String sourceFileName, String destinationFileName) throws FileCopyException;
    void deleteFile(String fileName) throws FileDeletionException;

}
