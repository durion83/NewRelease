package sample;

import java.io.IOException;

/**
 * Created by ahmad on 22-Nov-15.
 */
public class Copy {

    public void StartCopy (String src){

        String source = src;

        try{
            Process p = Runtime.getRuntime().exec("cmd /c start C:/Users/ahmad/Desktop/log/Copy.bat " + source);
            p.waitFor();

        }catch (IOException e) {
            e.printStackTrace();


        }catch( InterruptedException e ){

        }

        try {
            Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
