package murach.data;

import murach.business.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UserIO {

    public static boolean add(User user, String filepath) {
        boolean isAdded = false;
        try (PrintWriter out = new PrintWriter(new FileWriter(filepath, true));) {
            out.println(user.getEmail() + "|" + user.getFirstName() + "|" + user.getLastName());
            isAdded = true;
        } catch (IOException e) {
            System.out.println(e);
        }
        return isAdded;
    }

    public static User getUser(String email, String filepath) {
        /*
        try (var fis = new FileOutputStream(filepath);
             var bis = new BufferedOutputStream(fis);
             var ois = new ObjectOutputStream(bis)) {
            ois.writeObject("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        try (BufferedReader in = new BufferedReader(new FileReader(filepath));) {
            User user = null;
            String line = in.readLine();
            while (line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, "|");
                if (tokenizer.countTokens() < 3) {
                    return new User("", "", "");
                }
                String token = tokenizer.nextToken();
                if (token.equalsIgnoreCase(email)) {
                    String firstName = tokenizer.nextToken();
                    String lastName = tokenizer.nextToken();
                    user = new User(firstName, lastName, email);
                }
                line = in.readLine();
            }
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<User> getUsers(String filepath) {
        try (BufferedReader in = new BufferedReader(new FileReader(filepath));) {
            List<User> users = new ArrayList<>();

            String line = in.readLine();
            while (line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, "|");
                String email = tokenizer.nextToken();
                String firstName = tokenizer.nextToken();
                String lastName = tokenizer.nextToken();
                User user = new User(firstName, lastName, email);
                users.add(user);
                line = in.readLine();
            }
            return users;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
}