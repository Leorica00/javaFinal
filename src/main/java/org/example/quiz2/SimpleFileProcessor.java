package org.example.quiz2;

import Exceptions.FileCopyException;
import Exceptions.FileDeletionException;

import java.io.*;
import java.util.logging.*;

public class SimpleFileProcessor implements FileProcessor {
    private static final Logger logger = Logger.getLogger("QuizN2SimpleFileProcessor");

    public SimpleFileProcessor() {
        try {
            Handler fileHandler = new FileHandler("file_processing_log.txt", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Error occurred during fileHandler initializing", e.getMessage());
        }
    }

    @Override
    public void copyFile(String sourceFileName, String destinationFileName) throws FileCopyException {
        try {
            logger.log(Level.INFO, "Copying file");
            FileReader fileReader = new FileReader(sourceFileName);
            FileWriter fileWriter = new FileWriter(destinationFileName);
            int a;
            while((a=fileReader.read()) !=-1)
            {
                fileWriter.write(a);
            }
            fileReader.close();
            fileWriter.close();
            logger.log(Level.INFO, "File copied successfully");
        } catch (IOException e) {
            logger.log(Level.WARNING, "file coping failed", e.getMessage());
            throw new FileCopyException("File Copy Failed");
        }
    }

    @Override
    public void deleteFile(String fileName) {
        try {
            logger.log(Level.INFO, "Deleting file", fileName);
            File file = new File(fileName);
            if (!file.delete()) {
                throw new FileDeletionException("Failed to delete file");
            }
            logger.log(Level.INFO, "File deleted successfully");
        } catch (FileDeletionException e) {
            logger.log(Level.WARNING, "Error deletion failed", e.getMessage());
        }
    }
}
