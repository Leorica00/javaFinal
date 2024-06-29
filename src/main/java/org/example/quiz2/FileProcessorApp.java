package org.example.quiz2;

import Exceptions.FileCopyException;

public class FileProcessorApp {
    public static void main(String[] args) {
        SimpleFileProcessor simpleFileProcessor = new SimpleFileProcessor();
        try {
            simpleFileProcessor.copyFile("calculator.txt", "super.txt");
            simpleFileProcessor.deleteFile("baram.txt");

            simpleFileProcessor.copyFile("calculator.txt", "sunglasses.txt");
            simpleFileProcessor.deleteFile("sunglasses.txt");
        }catch (FileCopyException e) {
            e.printStackTrace();
        }
    }
}
