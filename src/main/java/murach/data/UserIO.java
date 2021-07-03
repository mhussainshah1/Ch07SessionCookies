package murach.data;

import murach.business.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UserIO {

    public static boolean add(User user, String filepath) throws IOException {
        boolean isAdded = false;
        System.out.println(filepath);
        try (var out = new PrintWriter(new FileWriter(filepath, true));) {
            out.println(user.getEmail() + "|" + user.getFirstName() + "|" + user.getLastName());
            isAdded = true;
        }
        return isAdded;
    }

    public static User getUser(String email, String filepath) throws IOException {
/*        try (var fis = new FileOutputStream(filepath);
             var bis = new BufferedOutputStream(fis);
             var ois = new ObjectOutputStream(bis)) {
            ois.writeObject("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        User user = null;
        try (BufferedReader in = new BufferedReader(new FileReader(filepath));) {
            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                if (t.countTokens() < 3) {
                    return new User("", "", "");
                }
                String token = t.nextToken();
                if (token.equalsIgnoreCase(email)) {
                    String firstName = t.nextToken();
                    String lastName = t.nextToken();
                    user = new User(firstName, lastName, email);
                }
                line = in.readLine();
            }
        }
        return user;
    }

    public static List<User> getUsers(String filepath) throws IOException {
        List<User> users;
        try (BufferedReader in = new BufferedReader(new FileReader(filepath));) {
            users = new ArrayList<>();
            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String email = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                User user = new User(firstName, lastName, email);
                users.add(user);
                line = in.readLine();
            }
        }
        return users;
    }
}