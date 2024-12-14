import java.io.*;
import java.util.*;

public class FileScan {

    private Scanner i;

    public void readfile(){

        try{
            i = new Scanner(new File("data.txt"));
        } catch (Exception e){
            System.out.println("File not found");
        }
    }


    public void readFile2(){
        while(i.hasNext()){
            String a = i.next();
            String b = i.next();
            String c = i.next();
            String d = i.next();
            String e = i.next();
            String f = i.next();
            String g = i.next();

            System.out.printf("%s %s %s %s %s %s %s\n",a,b,c,d,e,f,g);

        }
    }

    public void stop(){
        i.close();
    }

}