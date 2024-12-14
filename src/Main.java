import java.io.File;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        getfile();

        String filename = getfile();



        if (filename.equals("None")) {
            System.out.println("You did not select a file");
        }


    }


    public static String getfile () {

        String filepath = "None";
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        int result = chooser.showOpenDialog(chooser);
        return filepath;

    }


}