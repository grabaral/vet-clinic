package main.java.com.magicvet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        String pattern = "\\+\\d{1}-\\d{3}-\\d{3}-\\d{4}";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(inputText);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

