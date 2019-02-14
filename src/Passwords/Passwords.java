package Passwords;

import java.io.*;

public class Passwords {

    public static void main(String[] args) {

        String filename = "/Users/chihiro/Desktop/JavaPrograms/Passwords/src/passwords.txt";
        String[] passwords = new String[10];

        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! Could not open file");
        } catch (IOException e) {
            System.out.println("Error! Could not read file");
        }
        for (String password : passwords) { //for each password in passwords
            System.out.println("\n[" + password + "]");
            for (int n = 0; n < password.length(); n++) {
                //contains number
                if ("0123456789".contains(password.substring(n, n + 1))) {
                    System.out.println("Position " + n + " contains a number");
                } else if ("abcdefghijklmnopqestuvwxyz".contains(password.substring(n, n + 1))) {
                    System.out.println("Position " + n + " contains a letter");
                } else if ("!@#".contains(password.substring(n, n + 1))) {
                    System.out.println("Position " + n + " contains a special character");
                }

            }

        }

    }
}
