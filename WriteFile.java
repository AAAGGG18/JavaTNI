package WriteFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public static String input_user(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.print("Enter gender : ");
        String gender = scanner.next();
        System.out.print("Enter birth year : ");
        String birthyear = scanner.next();

        return username + "," + password + "," + gender + "," + birthyear;
    }

    public static void main(String[] args) throws IOException {
        String data = input_user();

        FileWriter fileWriter = new FileWriter("src/WriteFile/user2.txt", true);
        PrintWriter writer = new PrintWriter(fileWriter);


        writer.println(data);

        writer.close();

    }
}
