package ru.ibs.junit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileParser {
    public String argsToString(String[] args) {
        String pathToken = Arrays.toString(args);
        return pathToken.substring(1, pathToken.length() - 1);
    }

    public String fizzBuzzParser(String inputNumber) {
        if (Integer.parseInt(inputNumber) % 3 == 0 && Integer.parseInt(inputNumber) % 5 == 0) {
            return "FizzBuzz";
        } else if (Integer.parseInt(inputNumber) % 3 == 0) {
            return "Fizz";
        } else if (Integer.parseInt(inputNumber) % 5 == 0) {
            return "Buzz";
        } else {
            return inputNumber;
        }
    }

    public void resultOfParsingFile(String path) {
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).map(this::fizzBuzzParser).forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
