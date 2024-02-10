package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String NAME_PATTERN = "[a-zA-Z-]{3,}";

    public Client registerNewClient() {
        Client client = null;

        System.out.println("Please provide client details.");

        System.out.print("Email: ");
        String email = Main.SCANNER.nextLine();

        System.out.print("First name: ");
        String firstName = Main.SCANNER.nextLine();

        System.out.print("Last name: ");
        String lastName = Main.SCANNER.nextLine();


        if (isEmailValid(email)&&isNameValid(firstName,true)&&isNameValid(lastName,false)) {
            client = buildClient(email,firstName,lastName);
            System.out.println("New client: " + client.getFirstName() + " " + client.getLastName() + " (" +client.getEmail() + ")");
        }
        return client;
    }

    static Client buildClient(String email, String firstName, String lastName) {
        Client client = new Client();
        client.setEmail(email);
        client.setFirstName(firstName);
        client.setLastName(lastName);

        System.out.println("Location: ");
        String location = Main.SCANNER.nextLine();
        client.setLocation(Client.Location.valueOf(location));

        return client;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if (!result) {
            System.out.println("Provided email is invalid.");
        }
        return  result;
    }

    private static boolean isNameValid(String name, boolean firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (!result) {
            System.out.println("Provided "+(firstName ? "first name": "last name")+" is invalid.");
        }
        return  result;
    }
}
