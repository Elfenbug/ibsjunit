package ru.ibs.junit;

public class App {
    public static void main(String[] args) {
        FileParser parser = new FileParser();
        String path = parser.argsToString(args);
        parser.resultOfParsingFile(path);
    }
}
