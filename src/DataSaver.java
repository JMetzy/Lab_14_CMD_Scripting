import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataSaver {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("DataSaver.txt"));

        writer.write("First Name:\n" + "Last name:\n" + "ID number:\n" + "Year of birth:\n");
        writer.close();

        System.out.printf("%s %s %s %s\n", "First Name\n", "Last Name\n", "ID number\n", "Year of birth\n");

    }
}