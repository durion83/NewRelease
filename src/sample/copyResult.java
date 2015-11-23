package sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ahmad on 22-Nov-15.
 */
public class copyResult {

    public void log(String name) {

        // How to call the method
        //String logs="C:\\Users\\ahmad\\Desktop\\log\\Log.txt";
        //ReadLog read = new ReadLog();
        //read.log(logs);

        String fileName = name;

        try {
            FileInputStream fs = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            for (int i = 0; i < 19; ++i)
                br.readLine();
            String lineIWant = br.readLine();
            if (lineIWant.equals("The process cannot access the file because it is being used by another process.")) {
                System.out.println(lineIWant);
            } else
                System.out.println("process completed");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


